
/**
 * Runner
 *
 * @author (Emily Greene)
 * @version (924)
 */

import java.util.Scanner;
public class Runner{ 
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = ""; 
        Person[] p = new Person[2];
        while(!inputStr.equals("quit")){
            System.out.println("");
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            if(!inputStr.equals("quit")){
                Person person = new Person(inputStr);
                for(int i = 0; i < p.length; i++){
                    p[i] = person;
                    System.out.println(p);
                }
            }
        }
    }
    //creates a bigger array that still contains the info from the original array
    public Person[] extendArray(Person[] p, int n){
        Person[] p2 = new Person[p.length + n];
        for(int i = 0; i < p.length; i++){
            p2[i] = p[i];
        }
        return p2;
    }
    //prints every name in the person list
    public void printNames(Person[] p2){
        System.out.println(p2);
    }
}
