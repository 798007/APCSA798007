import java.util.*;
/**
 * Student
 *
 * @author (Emily Greene)
 * @version (1025)
 */
public class Student
{
    private String fullName;
    private int stuNumber;
    private double gpa;
    private String fName = "";
    private String mName = "";
    private String lName = "";
    public Student(String name, int num, double GPA)
    {
       fullName = name;
       stuNumber = num;
       gpa = GPA;
    }
    public String getName(){
        parseUserInput(fullName);
        return (fName + " " + mName + " " + lName);
    }
    public int getNumber(){
        return stuNumber;
    }
    public double getGPA(){
        return gpa;
    }
    public String setFName(String name){
        fName = name;
        return fName;
    }
    public String setMName(String name){
        mName = name;
        return mName;
    }
    public String setLName(String name){
        lName = name;
        return lName;
    }
    public void parseUserInput(String fullName){
        int comma = fullName.indexOf(",");
        int space = fullName.indexOf(" ");
        int space2 = fullName.lastIndexOf(" ");
        //format one
        if(comma != -1 & space != space2){
            setFName(fullName.substring(comma+1, space2));
            setMName(fullName.substring(space2 + 1));
            setLName(fullName.substring(0, comma));
        }
        //format two
        if(comma != -1 & space == space2){
            setFName(fullName.substring(comma + 2));
            setMName("");
            setLName(fullName.substring(0, comma));
        }
        //format three
        if(space != space2 & comma == -1){
            setFName(fullName.substring(0, space));
            setMName(fullName.substring(space+1, space2));
            setLName(fullName.substring(space2+1));
        }
        //format four
        if(comma == -1 & space == space2){ 
            setFName(fullName.substring(0, space));
            setMName("");
            setLName(fullName.substring(space+1));
        }
    }
}
