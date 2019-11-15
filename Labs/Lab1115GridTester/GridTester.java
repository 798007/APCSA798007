
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
    public void loadArray(){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                mat[r][c] = (int)(Math.random()*100)+1;
            }
        }
    }
    public void printArray(){
        loadArray();
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                System.out.print(mat[r][c] + ", ");
            }
            System.out.println();
        }
    }
    public int sumAll(){
        int sum = 0;
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                sum = sum + mat[r][c];
            }
        }
        return sum;
    }
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
    public double findAvg(){
        int sum = sumAll();
        return sum/100;
    }
}
