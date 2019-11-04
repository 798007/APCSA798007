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
        return fullName;
    }
    public int getNumber(){
        return stuNumber;
    }
    public double getGPA(){
        return gpa;
    }
}
