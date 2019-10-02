
/**
 * Runner
 *
 * @author (Emily Greene)
 * @version (924)
 */

import java.util.Scanner;
public class Runner{ 
    static int obInArray = 0;
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = ""; 
        Person[] persons = new Person[2];
        int j = 0;
        while(!inputStr.equals("quit")){
            System.out.println("");
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            if(!inputStr.equals("quit")){
                Person person = new Person(inputStr);
                if(j < persons.length){
                    obInArray++;
                    persons[j] = person;
                    printNames(persons);
                    j++;
                }
                if(persons[persons.length-1] != null){
                    System.out.println();
                    System.out.println("Would you like to print out more names? Enter \"yes\" or \"no\".");
                    inputStr = kb.nextLine();
                    if(inputStr.equals("yes")){
                        persons = extendArray(persons, 10);
                    }
                }
            }
        }
    }
    //creates a bigger array that still contains the info from the original array
    public static Person[] extendArray(Person[] p, int n){
        Person[] p2 = new Person[p.length + n];
        for(int i = 0; i < p.length; i++){
            p2[i] = p[i];
        }
        Person[] persons = p2;
        return p2;
    }
    //prints every name in the person list
    public static void printNames(Person[] p2){
        System.out.print("Names: ");
        for(int i=0; i < obInArray; i++){
            System.out.print(p2[i].fName + " " + p2[i].mName + " " + p2[i].lName + ", ");
        }
    }
}
