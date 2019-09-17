
/**
 * Write a description of class ExamOneReview here.
 *
 * @author (Emily Greene)
 * @version (916)
 */
public class ExamOneReview
{
    //Number 1
    boolean test = true;
    //For example 2, E is correct
    int num2 = 3;
    double num1 = num2%3;
    
    //Number 2 ("Pumpkin" Class is replaced by "ExamOneReview" to keep
    //everything in one file)
    private int num;
    public ExamOneReview(int n){
        num = n;
    }
    ExamOneReview p = new ExamOneReview(3);
    
    //Number 3
    private int x;
    private int y;
    public ExamOneReview(int num1, int num2){
        x = num1;
        y = num2;
    }
    public static int multiply(int x, int y){
        System.out.print(x*y);
        return x*y;
    }
    
    //Number 4
    //Example 1
    public static int digits(){
        int count = 0;
        int num = 12345;
        while (num != 0){
            num = num/10;
            count++;
        }
        System.out.print("count = " + count);
        return count;
    }
    //Example 2
    public static int digitSum(){
        int sum = 0;
        int num = 12345;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.print("sum = " + sum);
        return sum;
    }
    
    //Number 5
    public static int sum(){
        int sum = 0;
        int num = 78910;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.print("sum = " + sum);
        return sum;
    }
    
    //Number 6
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        if(b == 0){
            System.out.print("Can't divide by 0");
            return 0;
        }
        return a/b;
    }
    
    //Number 7
    public static void numberSeven(){
        int cntrl = 0, number = 5;
        while(cntrl < number){
            cntrl++;
            System.out.print("number = " + number + ", cntrl = " + cntrl);
        }
    }
    
    //Number 8
    public static String numberEight(){
        double num1 = 8.0; 
        double num2 = 8.0;
        if(num1 > num2){
            System.out.println("Peace Out");
            return "Peace Out";
        }else if (num1 <= num2){
            System.out.println("Far Out");
            return "Far Out";
        }else if(num1 == num2){
            System.out.println("Space Out");
            return "Space Out";
        }else
            System.out.println("Freak Out");
            return "Freak Out";
    }
    
    //Number 9
    public static int[] randomArray(){
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10)+1;
        }
        //Number 10
        for(int n = 0; n < nums.length; n++){
            System.out.print(nums[n] + ", ");
        }
        return nums;
    }
   
    //Number 11
    public static int arraySum(){
        int[] array = new int[5];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10)+1;
            sum = sum + array[i];
        }
        return sum;
    }
    
    //Number 12
    public static int[] copyArray(int[] origArray){
        int[] newArray = new int[origArray.length];
        for(int i = 0; i <origArray.length; i++){
            newArray[i] = origArray[i];
        }
        return newArray;
    }
}
