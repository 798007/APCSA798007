
/**
 * Write a description of class MyPicture here.
 *
 * @author (Emily Greene)
 * @version (829)
 */
import java.awt.*;
public class MyPicture
{
    public static void main(){
        Turtle   t;
    
            TurtleDrawingWindow win = new TurtleDrawingWindow();
    
            int      size, turn;
    
            t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
            
                t.jumpTo(-100, -100);
            win.add(t);
            win.setVisible(true);
            t.penSize(3);
            size     = 200;    //logical units
            turn     = 93;    //in degree
            t.penColor(Color.blue);
            for(int i = 0; i < 120; i++){
                t.move( size ); 
                t.turn( turn );
                String n = ""+i;
                //t.print(n);
            }
            t.jumpTo(95, 95);
            t.heading(0);
            size     = 150;
            t.penColor(Color.pink);
            t.penSize(3);
            turn = 123;
            for(int i = 0; i < 120; i++){
                t.move( size ); 
                t.turn( turn );
                String n = ""+i;
                //t.print(n);
            }
            t.penSize(2);
            t.jumpTo(-75, 180);
            t.heading(0);
            size     = 150;
            turn = 143;
            t.penColor(Color.green);
            
            for(int i = 0; i < 120; i++){
                t.move( size ); 
                t.turn( turn );
                String n = ""+i;
                //t.print(n);
        }
            t.penSize(1);
            t.jumpTo(-280, 155);
            t.heading(0);
            size = 175;
            turn = 167;
            t.penColor(Color.red);
            
            for(int i = 0; i < 120; i++){
                t.move(size);
                t.turn(turn);
                String n = ""+i;
            }
        
        
        t.hide();

    }
}
