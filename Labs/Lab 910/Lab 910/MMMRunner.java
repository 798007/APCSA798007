
/**
 * Write a description of class MMMRunner here.
 *
 * @author (Emily Greene)
 * @version (910)
 */
import java.util.Arrays;
public class MMMRunner
{
    
    int[] nums = new int[100];

    /**
     * Constructor for objects of class MMMRunner
     */
    public MMMRunner()
    {
        // initialise instance variables
       
    }

    public void loadArray(){
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*10) + 1;
        }
    }
    public void printArray(){
        for(int i=0; i<10; i++){
            System.out.print(nums[i]);
        }
        
    }
    public int getSum(){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
    public double getMean(){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        return sum/nums.length;
    }
    public double getMedian(){
        Arrays.sort(nums[]);
        double median = (nums[49] + nums[50])/2;
        return median;
    }
    public int getMode(){
        
    }
}
