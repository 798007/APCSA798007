
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
        for(int row=9; row<nums.length; row+=10){
            for(int i=row-9; i<=row; i++){
                if(i<row){
                    System.out.print(nums[i] + ", ");
                }
                if(i==row & i!=99){
                    System.out.println(nums[i] + ", ");
                }
                if(i==row & i==99){
                    System.out.println(nums[i]);
                }
            }
    }
    }
    public int getSum(){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
        return sum;
    }
    public double getMean(){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum/nums.length);
        return sum/nums.length;
    }
    public double getMedian(){
        Arrays.sort(nums, 0, nums.length);
        double median = (nums[49] + nums[50])/2;
        System.out.println(median);
        return median;
    }
}
