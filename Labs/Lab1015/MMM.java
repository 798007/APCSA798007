import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class MMM here.
 *
 * @author (Emily Greene)
 * @version (1015)
 */
public class MMM
{
    static ArrayList<Integer> nums = new ArrayList<Integer>();
    public MMM()
    {
        
    }
    //loads the array with random numbers between 1-10
    public void loadArrayList(){
        for(int i = 0; i<=100; i++){
            nums.add((int)(Math.random()*10)+1);
        }
    }
    //prints out the arraylist in lines of 10
    public void printArray(){
        for(int row=9; row<nums.size(); row+=10){
            for(int i=row-9; i<=row; i++){
                if(i<row){
                    System.out.print(nums.get(i) + ", ");
                }
                if(i==row & i!=99){
                    System.out.println(nums.get(i) + ", ");
                }
                if(i==row & i==99){
                    System.out.println(nums.get(i));
                }
            }
        }
    }
    //prints the sum of all of the numbers in the array
    public int sum(){
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            sum = sum + nums.get(i);
        }
        System.out.println(sum);
        return sum;
    }
    
    
    //prints out the mean of the array
    public static double mean(){
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            sum = sum + nums.get(i);
        }
        System.out.println(sum/nums.size());
        return sum/nums.size();
    }
    //prints the median of the array
    public double median(){
        Collections.sort(nums);
        double median = (nums.get(49) + nums.get(50))/2;
        System.out.println(median);
        return median;
    }  
}

