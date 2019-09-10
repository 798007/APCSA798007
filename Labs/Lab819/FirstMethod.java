
/**
 * FirstMethod *
 * Emily Greene
 * 819
 */
public class FirstMethod
{
    /**
     * Constructor for objects of class FirstMethod
     */
    public FirstMethod()
    
    {
    }
    //this method adds two integers
    public static int add(int a, int b){
        return (a + b);
    }
    //this method subtracts two integers
    public static int subtract(int a, int b){
        return (a - b);
    }
    //this method multiplies two integers
    public static int multiply(int a, int b){
        return (a * b);
    }
    //this method divides two integers
    public static int divide(int a, int b){
        if(b==0)
        {return -1;
        }
        return (a / b);
    }
    public static int greaterThan(int a, int b){
        if(a > b)
        {
            return a;
        }
        if(b < a)
        {
            return b;
        }
        return a;
    }
    //this is my main method
    public static void main(){
     System.out.println(add(10,5));
     System.out.println(subtract(10,5));
     System.out.println(multiply(10,5));
     System.out.println(divide(10,5));
     System.out.println(greaterThan(10, 5));
    }
}
