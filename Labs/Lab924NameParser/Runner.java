
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
                }
                extendArray(p, 5);
                
            }
        }
    }
    public Person[] extendArray(Person[] p, int n){
        Person[] p2 = new Person[p.length + n];
        for(int i = 0; i < p.length; i++){
            p2[i] = p[i];
        }
        n = n + 2;
        return p2;
    }
    public void printNames(Person[] p, Person[] p2){
        if(p[0] == p2[0]){
            for(int i = 0; i < p2.length; i++){
                System.out.println(p2);
            }
        }else{
            for(int n = 0; n < p.length; n++){
                System.out.println(p);
            }
        }
    }
}
