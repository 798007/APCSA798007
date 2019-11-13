import java.util.*;
/**
 * Quiz
 *
 * @author (Emily Greene)
 * @version (1112)
 */
public class Quiz1108{
    public Quiz1108(){
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> n1 = makeList(x);
        int[] y = reverseList(n1);
        printList(n1);
        printArray(y);
    }
    public ArrayList<Integer> makeList(int[] nums){ 
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            ints.add(nums[i]);
        }
        return ints;
    }  
    public int[] reverseList(ArrayList<Integer> nums){ 
        int[] ints = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            ints[i] = nums.get(nums.size()-1-i);
        }
        return ints;
    }
    public void printList(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
    }
    public void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +  ", ");
        }
    }
    public static void main(){
        Quiz1108 q = new Quiz1108();
    }
}


