
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (Emily Greene)
 * @version (912)
 */
public class SimpleCalc
{
    private int num1;
    private int num2;
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(int x, int y)
    {
        num1 = x;
        num2 = y;
    }
    //adds the integers
    public double add(){
        System.out.println(num1 + num2);
        return num1 + num2;
    }
    //subtracts the integers
    public double subtract(){
        System.out.println(num1 - num2);
        return num1 - num2;
    }
    //multiplies the integers
    public double multiply(){
        System.out.println(num1 * num2);
        return num1 * num2;
    }
    //divides the integers
    public double divide(){
        if(num2 == 0){
            System.out.println("Cannot divide by zero");
            num2 = 1;
        }else{
        System.out.println(num1 / num2);
        }
        return num1 / num2;
    }
    //finds the remainder after dividing the integers
    public int moduloDivide(){
        System.out.print(num1 % num2);
        return num1 % num2;
    }
}
