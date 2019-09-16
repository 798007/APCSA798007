//© A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri
{
   public static void main(String args[])
   {

    /*
        *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
        */

        int stop=9;
        for(int row = 0; row<=stop; row++){
            for(int r = 0; r<=row; r++){
                System.out.print("*");
            }
            System.out.println();
          }
        //add in a for loop to print the rows   //rows
           //add in a for loop to print out the * on each row  //columns
              //System.out.print("*");
           //print out a new line


    }
}