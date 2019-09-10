
/**
 * Pumpkin Class
 *
 * @author (Emily Greene)
 * @version (823)
 */
public class Pumpkin
{
    // instance variables
    private double rad;
    private int id;
    
    //constructor
    public Pumpkin(double r, int id)
    {
        rad = r;
        this.id = id;
    }
    
    //main method - when called it returns the pumpkin's radius
    public double getRadius(){
        return rad;
    }
}
