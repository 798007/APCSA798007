
/**
 * Write a description of class CalcRunner here.
 *
 * @author (Emily Greene)
 * @version (912)
 */
public class CalcRunner
{
    public CalcRunner(){
    
    }
    public static void main(){
        SimpleCalc runner = new SimpleCalc(15, 6);
        runner.add();
        runner.subtract();
        runner.multiply();
        runner.divide();
        runner.moduloDivide();
    }
}
