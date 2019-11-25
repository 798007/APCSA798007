import java.util.*;
/**
 * Lab1119: 2D Arrays
 *
 * @author (Emily Greene)
 * @version (1119)
 */
public class Lab1119
{
    int[][] nums = new int[10][10];
    public Lab1119(){
        printArray();
        rowMean();
        System.out.println();
        rowMedian();
        System.out.println();
        rowMode();
        System.out.println();
        totalMean();
    }
    public static void main(){
        Lab1119 run = new Lab1119();
    }
    //creates a 2D array of random values between 1 and 10
    public void loadArray(){
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                nums[r][c] = (int)(Math.random()*10)+1;
            }
        }
    }
    //prints the 2D array onto the console
    public void printArray(){
        loadArray();
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                System.out.print(nums[r][c] + ", ");
            }
            System.out.println();
        }
    }
    //finds and prints the mean of each individual row in the array
    public void rowMean(){
        int sum;
        System.out.println("Means of each row: ");
        for(int r = 0; r < nums.length; r++){
            sum = 0;
            for(int c = 0; c < nums[r].length; c++){
                sum = sum + nums[r][c];
            }
            System.out.println(sum/nums[r].length);
        }
    }
    //finds and prints the median of each row in the array
    public void rowMedian(){
        int median; 
        System.out.println("Medians of each row: ");
        for(int r = 0; r < nums.length; r++){
            median = (nums[r][4]+nums[r][5])/2;
            System.out.println(median);
        }
    }
    //finds and prints the mode(s) of each row in the array
    public void rowMode(){
        System.out.println("Modes of each row: ");
        for(int r = 0; r < nums.length; r++){
            int[] vals = new int[11];
            ArrayList<Integer> mode = new ArrayList<Integer>();
            for(int c = 0; c < nums[r].length; c++){
                vals[nums[r][c]]++;
            }
            for(int i = 1; i < vals.length; i++){
                if(vals[i] == findGreatestValue(vals)){
                    mode.add(i);
                }
            }
            System.out.println(mode);
        }
    
    }
    //this method traverses an inputted array to find and return its greatest value
    public int findGreatestValue(int[] x){
        int greatestValue = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > greatestValue){
                greatestValue = x[i];
            }
        }
        return greatestValue;
    }
    //finds the mean of the entire 2D array
    public void totalMean(){
        int sum = 0;
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                sum = sum + nums[r][c];
            }
        }
        System.out.println("Mean of all values in the array: " + sum/100);
    }
}
  
