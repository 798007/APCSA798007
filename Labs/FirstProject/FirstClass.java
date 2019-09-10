
/**
 * FirstClass *
 * Emily Greene
 * 815
 */
public class FirstClass
{
    private static int x;
    /**
     * Constructor for objects of class FirstClass
     */
    public FirstClass()
    {
    }
    //prints name
    public static void printName(String name, int n){
        System.out.print("Hello there, " + name + "     " + n);
    }
    //main method
    public static void main(){
        x = 7;
        printName("Emily", x); 
    }

  
}
