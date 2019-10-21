import java.util.*;
/**
 * BubbleSort
 *
 * @author (Emily Greene)
 * @version (1017)
 */
public class BubbleSort
{
    static ArrayList<Integer> nums = new ArrayList<Integer>();
    public BubbleSort()
    {
    }
    public static void main(){
        loadList(100);
        sortList(nums);
    }
    //creates an arraylist of numbers between 1 and 100
    public static void loadList(int n){
        for(int i = 0; i < n; i++){
            int random = (int)((Math.random()*100)+1);
            nums.add(random);
        }
    }
    //sorts the arraylist from least to greatest and prints the sorted arraylist
    public static void sortList(ArrayList<Integer> list){
        for(int i = list.size()-1; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                if(list.get(j-1) > list.get(j)){
                    swap(list, j-1, j);
                }
            }
        }
        System.out.print(list);
    }
    //swaps two values in the arraylist if the next integer is greater than the first integer
    public static void swap(ArrayList<Integer> ints, int i, int n){
        int temp = ints.get(i);
        ints.set(i, n);
        ints.set(n, temp);
    }
}
