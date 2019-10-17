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
        loadList(100);
        sortList(nums);
    }
    
    public static void loadList(int n){
        for(int i = 0; i < n; i++){
            int random = (int)((Math.random()*100)+1);
            nums.add(random);
        }
    }
    
    public static void sortList(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size()-j; j++){
                if(list.get(j) > list.get(j+1)){
                    swap(list, j, j+1);
                }
            }
        }
        System.out.print(list);
    }
    
    public static void swap(ArrayList<Integer> ints, int i, int n){
        int temp = ints.get(i);
        ints.set(i, n);
        ints.set(n, temp);
    }

    public static void main(){
        loadList(100);
        sortList(nums);
    }
}
