import java.util.*;
/**
 * Write a description of class IntArrayWorker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntArrayWorker
{
    
   

    /**
     * Constructor for objects of class IntArrayWorker
     */
    public IntArrayWorker()
    {
        //int[] nums = {6, 5, 4, 7, 2};
        //mirrorAtCenter(nums);
        int[][] numbers = new int[6][6];
        loadEvensOdds(numbers);
        System.out.println();
        flipVertical(numbers);
    }
    
    public static void main(){
        IntArrayWorker run = new IntArrayWorker();
    }
    
    public void loadEvensOdds(int[][] arr){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length/2; c++){
                int num = (int)((Math.random()*10)+1);
                if(num % 2 == 0){
                   arr[r][c] = num;
                }else{
                   arr[r][c] = num + 1;
                }
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = arr[r].length/2; c < arr[r].length; c++){
                int num = (int)((Math.random()*10)+1);
                if(num % 2 == 1){
                   arr[r][c] = num;
                }else{
                   arr[r][c] = num + 1;
                }
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + ", ");
            }
            System.out.println();
        }
    }
    
    public void flipVertical(int[][] arr){
        int center = arr.length/2;
        int leftNum = 0;
        int rightNum = 0;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < center; c++){
                leftNum = arr[r][c];
                rightNum = arr[r][arr.length - 1 - c];
                arr[r][c] = rightNum;
                arr[r][arr.length - 1 - c] = leftNum;
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + ", ");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
    
    
    //warmup 1104
    //public void mirrorAtCenter(int[] arr){
    //    int[] array = new int[arr.length];
    //    for(int i = 0; i < array.length ; i++){
    //        System.out.print(arr[i] + ", ");
    //    }
    //    System.out.println();
    //    for(int i = 0; i < array.length ; i++){
    //        array[i] = arr[array.length - 1 - i];
    //        System.out.print(array[i] + ", ");
    //    }
    //}
    
    
    
}
