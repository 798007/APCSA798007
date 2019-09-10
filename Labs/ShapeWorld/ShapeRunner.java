
/**
 * Write a description of class ShapeRunner here.
 *
 * @author (Emily Greene)
 * @version (ShapeWorld 823)
 */
public class ShapeRunner
{
    public static void main()
    {
        APCSColor blue = new APCSColor(0, 0, 1);
        APCSColor red = new APCSColor(1, 0, 0);
        APCSColor green = new APCSColor(0, 1, 0);
        
        ShapeWorld shapeWorld = new ShapeWorld(700, 700);
        APCSCircle circle1 = new APCSCircle(350, 350, 100);
        shapeWorld.addCircle(circle1);
        circle1.setFillColor(blue);
        APCSLine line1 = new APCSLine(350, 450, 350, 600);
        shapeWorld.addLine(line1);
        APCSLine line2 = new APCSLine(350, 500, 250, 450);
        shapeWorld.addLine(line2);
        APCSLine line3 = new APCSLine(350, 500, 450, 450);
        shapeWorld.addLine(line3);
        APCSLine line4 = new APCSLine(0, 660, 700, 660);
        shapeWorld.addLine(line4);
        APCSLine line5 = new APCSLine(350, 600, 425, 660);
        shapeWorld.addLine(line5);
        APCSLine line6 = new APCSLine(350, 600, 275, 660);
        shapeWorld.addLine(line6);
        APCSCircle circle2 = new APCSCircle(250, 450, 25);
        shapeWorld.addCircle(circle2);
        APCSCircle circle3= new APCSCircle(450, 450, 25);
        shapeWorld.addCircle(circle3);
        //attempt at a cowboy hat
        APCSTriangle triangle1 = new APCSTriangle(290, 255, 410, 255, 350, 200);
        shapeWorld.addTriangle(triangle1);
        APCSLine line7 = new APCSLine(280, 255, 420, 255);
        shapeWorld.addLine(line7);
        APCSLine line8 = new APCSLine(280, 255, 265, 250);
        shapeWorld.addLine(line8);
        APCSLine line9 = new APCSLine(420, 255, 435, 250);
        shapeWorld.addLine(line9);
        //clothes
        APCSRectangle rectangle1 = new APCSRectangle(325, 465, 375, 565);
        shapeWorld.addRectangle(rectangle1);
        APCSTriangle triangle2 = new APCSTriangle(325, 465, 300, 475, 325, 500);
        shapeWorld.addTriangle(triangle2);
        APCSTriangle triangle3 = new APCSTriangle(375, 465, 400, 475, 375, 500);
        shapeWorld.addTriangle(triangle3);
    }
}
