
/**
 * Write a description of class NestedLoops here.
 *
 * @author (Emily Greene)
 * @version (918)
 */
public class NestedLoops
{
    //prints out the pattern from the first problem
    public static void problemA(){
        for(int i = 1; i < 6; i++){
            for(int n = 0; n < i; n++){
                System.out.print(i);
            }
            System.out.println();
            System.out.print(" ");
        }
    }
    //prints out the pattern from the second problem
    public static void problemB(){
        for(int i = 5; i >= 2; i--){
            for (int n = 0; n < 8; n++){
                System.out.print(i);
            }
            System.out.println();
            System.out.print(" ");
        }
    }
    //prints out the pattern from the third problem if the input is 2, 3, or 6
    public static void problemC(int n){
        if(n == 2 || n == 3 || n == 6){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(n + " ");
                }
                System.out.println();
                System.out.print(" ");
            }
        }
    }
    //prints out the pattern from the fourth problem if the input is 7
    public static void problemD(int n){
        if(n == 7){
            for(int i = 0; i < n; i++){
                int count = n - i;
                for(int j = 0; j < count; j++){
                    System.out.print("-");
                }
                System.out.print(i + 1);
                System.out.println();
                System.out.print(" ");
            }
        }
    }
    //prints out the pattern from the fifth problem
    public static void problemE(){
        for(int i = 1; i <= 7; i++){
            for(int n = 0; n <= (7 - i); n++){
                System.out.print(" ");

            }
            for(int count = 0; count < i; count++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(" ");
        }
    }
    //prints out the pattern from the sixth problem
    public static void problemF(){
        for(int i = 1; i <= 7; i++){
            for(int n = 0; n <= (7 - i); n++){
                System.out.print(" ");
            }
            for(int star = 0; star < (i*2-1); star++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(" ");
        }
        for(int i = 6; i >= 1; i--){
            for(int n = 0; n <= (7 - i); n++){
                System.out.print(" ");
            }
            for(int star = 0; star < (i*2-1); star++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(" ");
        }
    }
    //prints out the pattern for the seventh problem
    public static void problemG(){
        System.out.println("+ - - - - - - - - +");
        for(int i = 1; i <= 4; i++){
            //top half of diamond
            System.out.print(" |     ");
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            } 
            for(int frontSlashes = 1; frontSlashes <= i - 1; frontSlashes++){
                if(i != 1){
                    System.out.print("/");
                }
            }
            System.out.print("+");
            for(int backSlashes = 1; backSlashes <= i - 1; backSlashes++){
                if(i != 1){
                    System.out.print("\\");
                }
            }
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            System.out.println("     |");
        }
        //bottom half of diamond
        for(int i = 4; i >= 1; i--){
            System.out.print(" |     ");
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            for(int backSlashes = 1; backSlashes <= i - 1; backSlashes++){
                if(i != 1){
                    System.out.print("\\");
                }
            }
            System.out.print("+");
            for(int frontSlashes = 1; frontSlashes <= i - 1; frontSlashes++){
                if(i != 1){
                    System.out.print("/");
                }
            }
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            System.out.println("     |");
        }
        System.out.println(" + - - - - - - - - +");
        //reprints bottom of diamond
        for(int i = 4; i >= 1; i--){
            System.out.print(" |     ");
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            for(int backSlashes = 1; backSlashes <= i - 1; backSlashes++){
                if(i != 1){
                    System.out.print("\\");
                }
            }
            System.out.print("+");
            for(int frontSlashes = 1; frontSlashes <= i - 1; frontSlashes++){
                if(i != 1){
                    System.out.print("/");
                }
            }
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            System.out.println("     |");
        }
        //reprints top of diamond
        for(int i = 1; i <= 4; i++){
            //top half of diamond
            System.out.print(" |     ");
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            } 
            for(int frontSlashes = 1; frontSlashes <= i - 1; frontSlashes++){
                if(i != 1){
                    System.out.print("/");
                }
            }
            System.out.print("+");
            for(int backSlashes = 1; backSlashes <= i - 1; backSlashes++){
                if(i != 1){
                    System.out.print("\\");
                }
            }
            for(int spaces = 0; spaces < 4 - i; spaces++){
                System.out.print(" ");
            }
            System.out.println("     |");
        }
        System.out.println(" + - - - - - - - - +");
    }
}

