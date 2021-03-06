package pixLab.classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  //method that keeps only blue values
  public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  //method that keeps only red values
  public void keepOnlyRed(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  //method that keeps only green values
  public void keepOnlyGreen(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
  }
  //method that negates all the pixels in a picture
  public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }
  //method that turns the picture into shades of gray
  public void grayscale(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
        pixelObj.setGreen((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
        pixelObj.setBlue((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
      }
    }
  }
  //method that modifies pixel colors to make the fish more visible in the picture
  public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if(pixelObj.getBlue() >= 150 & pixelObj.getRed() <= 23){
          pixelObj.setRed((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
          pixelObj.setGreen((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
          pixelObj.setBlue((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
        }
      }
    }
    
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  //method that mirrors a picture around a vertical mirror from right to left
  public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  //method that mirrors a picture around a horizontal mirror from top to bottom
  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[row].length; col++)
      {
        bottomPixel = pixels[height - 1 - row][col];
        topPixel = pixels[row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  //method that mirrors a picture around a horizontal mirror from bottom to top
  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[row].length; col++)
      {
        topPixel = pixels[height - 1 - row][col];
        bottomPixel = pixels[row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  //method that mirros a picure from the top right to bottom left corner
  public void mirrorDiagonal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    int width = pixels[0].length;
    for (int row = 0; row < height; row++)
    {
       for (int col = 0; col < pixels[row].length; col++)
       {
          leftPixel = pixels[row][col];
          rightPixel = pixels[height - 1 - row][width - 1 - col];
          rightPixel.setColor(leftPixel.getColor());
       }
    }
    
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
      System.out.println(count);
    }
  }
  //mirrors just the arms of the snowman
  public void mirrorArms(){
    int mirrorPoint = 187;
    int mirrorPoint2 = 195;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 157; row < mirrorPoint; row++)
    {
      // loop from 105 to 171
      for (int col = 105; col < 171; col++)
      {
        
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];      
        topPixel = pixels[row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    for (int row = 170; row < mirrorPoint2; row++)
    {
      // loop from 235 to 293
      for (int col = 235; col < 293; col++)
      {
        
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];      
        topPixel = pixels[row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
  }
  //mirrors the seagull to the right
  public void mirrorGull(){
    int mirrorPoint = 346;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 234; row < 320; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 238; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        
      }
      
    }
    
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  //second copy method that allows the user to copy just part of the fromPic
  public void copy(Picture fromPic, Picture toPic,
                 int toStartRow, int fromStartRow, int fromEndRow,
                 int toStartCol, int fromStartCol, int fromEndCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = toPic.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = fromStartRow, toRow = toStartRow; 
         fromRow < fromEndRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = fromStartCol, toCol = toStartCol; 
           fromCol < fromEndCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  //second mirrorVertical method that allows the user to only vertically mirror a piece of a picture
  public void mirrorVertical(int startRow, int endRow, int startCol, int endCol){
    int mirrorPoint = (startCol+endCol)/2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = startRow; row < endRow; row++)
    {
      // loop from start column to just before the mirror point
      for (int col = startCol; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        
      }
      
    }
    }
  //method that creates a collage of three manipulated pictures
  public void myCollage(Picture fromPic, Picture toPic){
      copy(fromPic, toPic, 0, 222, 334, 0, 203, 347);
      fromPic.zeroBlue();
      copy(fromPic, toPic, 150, 222, 334, 150, 203, 347);
      fromPic.grayscale();
      toPic.mirrorVertical(0, 112, 0, 143);
      copy(fromPic, toPic, 300, 222, 334, 300, 203, 347);
  }
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist){
          //leftPixel.setRed(leftPixel.getRed()-50);
          leftPixel.setBlue(leftPixel.getBlue()-15);
          //leftPixel.setGreen(leftPixel.getGreen()-15);
        }else{
          //leftPixel.setRed(leftPixel.getRed()+50);
          leftPixel.setBlue(leftPixel.getBlue()+50);
          //leftPixel.setGreen(leftPixel.getGreen()+50);
        }
      }
    }
  }
  //second edgeDetection method that compares a current pixel with the one below it
  public void edgeDetection2(int edgeDist){
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color bottomColor = null;
    for (int row = 0; row < pixels.length - 1; row++)
    {
        for (int col = 0; 
           col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row+1][col];
        bottomColor = bottomPixel.getColor();
        if (topPixel.colorDistance(bottomColor) > 
            edgeDist)
          topPixel.setColor(Color.BLUE);
        else
          topPixel.setColor(Color.BLACK);
      }
    }
    
    
    
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
