
/**
 * Person
 *
 * @author (Emily Greene)
 * @version (924)
 */
public class Person
{
    String fName, mName, lName;
    public Person(String fullName){
        parseName(fullName);
    }
    public void parseName(String fullName){
        int comma = fullName.indexOf(",");
        int space = fullName.indexOf(" ");
        int space2 = fullName.lastIndexOf(" ");
        //format one
        if(comma != -1 & space != space2){ //format one
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma+1, space2);
            mName = fullName.substring(space2);
        }
        //format two
        if(comma != -1 & space == space2){
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma + 2);
            mName = "";
        }
        //format three
        if(space != space2 & comma == -1){
            fName = fullName.substring(0, space);
            mName = fullName.substring(space+1, space2);
            lName = fullName.substring(space2+1);
        }
        //format four
        if(comma == -1 & space == space2){ 
            fName = fullName.substring(0, space);
            lName = fullName.substring(space+1);
            mName = "";
        }
        
        System.out.println("First name: " + fName);
        System.out.println("Middle name: " + mName);
        System.out.println("Last Name: " +lName);
     }
}
