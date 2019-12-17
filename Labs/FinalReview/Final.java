
/**
 * Write a description of class Final here.
 *
 * @author (Emily Greene)
 * @version (1216)
 */
public class Final
{
    public Final()
    {
        int[][] nums = new  int[10][10];
        loadNums(nums);
    }
    public static void main(){
        Final run = new Final();
    }
    public static void loop(){
      for(int i = 2; i > 0 ; i--)
        for(int j = i; j <= 2; j++)
            System.out.print(i + j + ", ");
    }
    public static void loop2(){
        int m = 0;
        int n = 7;
        while(m < 3) {
   		n--;
   		m++;
   	}
   	System.out.print("" + m + n);
    }
    public static void numberCheck(int minNum, int maxNum){
 	int total = 0;
	int k;
	for (k=1; k <= maxNum; k++) {
            if (k >= minNum) {
 		  total = total + k;
          }
        }
        System.out.println("the total is:" + total);
    }
    public static void strings(){
        String s = "Strings are friends, not food";
        int x = s.indexOf("friends");
        int y = s.indexOf("food");
        String str = s.substring(0, x) + "g" + s.substring(y + 1);
        System.out.println(str);
    }
    public static void toTheMax(int num) {
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
    }
    public int loadNums(int arr[][]){
        int numEvens = 0;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = (int)((Math.random()*10)+1);
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(arr[r][c]%2 == 0){
                    numEvens++;
                }
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + ", ");
            }
            System.out.println();
        }
        System.out.print(numEvens);
        return numEvens;
    }
}
