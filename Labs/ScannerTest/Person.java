
/**
 * Write a description of class Person here.
 *
 * @author (Emily Greene)
 * @version (924)
 */
public class Person
{
    String fName, mName, lName;
    public Person(String fullName){
        parseName(fullName);
        System.out.print(fullName);
    }
    public void parseName(String fullName){
        int comma = fullName.indexOf(",");
        int space = fullName.indexOf(" ");
        int space2 = fullName.lastIndexOf(" ");
        
        if(comma == -1 & fullName.lastIndexOf(" ") == fullName.indexOf(" ")){ 
            fName = fullName.substring(0, space);
            lName = fullName.substring(space+1);
            mName = "";
        }else{
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma + 2);
            mName = "";
        }
        if(fullName.lastIndexOf(" ") != fullName.indexOf(" ") & comma == -1){
            fName = fullName.substring(0, space);
            mName = fullName.substring(space+1, space2);
            lName = fullName.substring(space2+1);
        }else{
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma+1, space2);
            mName = fullName.substring(space2);
       }
    }
}
