import java.util.ArrayList;
/**
 * Write a description of class MMM here.
 *
 * @author (Emily Greene)
 * @version (1015)
 */
public class MMM
{
    ArrayList<Integer> nums = new ArrayList<Integer>();
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
    public static void mean(){
    
    }
    
    
    
}

