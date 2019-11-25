
/**
 * GridTester
 *
 * @author (Emily Greene)
 * @version (1115)
 */
public class GridTester
{
    int[][] mat = new int[10][10];
    /**
     * Constructor for objects of class GridTester
     */
    public GridTester()
    {
        printArray();
        System.out.println("\nSum of all values in the Array: " + sumAll());
        System.out.println("Greatest value in the Array: " + findGreatest());
        System.out.println("Number of times the greatest number appears: " + numberOfGreatest());
        System.out.println("Average: " + findAvg());
    }
    public static void main(){
        GridTester test = new GridTester();
    }
    //makes a 2D array of random integers between 1 and 100
    public void loadArray(){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                mat[r][c] = (int)(Math.random()*100)+1;
            }
        }
    }
    //prints out the array onto the console
    public void printArray(){
        loadArray();
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                System.out.print(mat[r][c] + ", ");
            }
            System.out.println();
        }
    }
    //returns the sum of every number in the 2D array
    public int sumAll(){
        int sum = 0;
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                sum = sum + mat[r][c];
            }
        }
        return sum;
    }
    //finds the biggest number in the entire array
    public int findGreatest(){
        int greatestVal = 0;
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                if(mat[r][c] > greatestVal){
                    greatestVal = mat[r][c];
                }
            }
        }
        return greatestVal;
    }
    //finds the amount of times the greatest number appears in teh array
    public int numberOfGreatest(){
        int numGreatest = 0;
        int greatestVal = findGreatest();
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                if(mat[r][c] == greatestVal){
                    numGreatest++;
                }
            }
        }
        return numGreatest;
    }
    //finds the average of all the numbers in the array
    public double findAvg(){
        int sum = sumAll();
        return sum/100;
    }
}
