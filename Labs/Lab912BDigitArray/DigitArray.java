
/**
 * Write a description of class DigitArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitArray
{
    private int num = 9876;
    int[] digits = new int[4];

    public DigitArray()
    {
        // initialise instance variables
       
    }
    public void loadArray()
    {
        for(int i=0; i<digits.length; i++){
            digits[i] =(num % 10);
            num = (int)(num / 10);
        }
    }
    public void getDigits(){
        for(int i=0; i<digits.length; i++){
            System.out.print(digits[i] + ", ");
        }
    }
}
