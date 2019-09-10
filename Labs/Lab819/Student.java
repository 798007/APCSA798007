
/**
 * Student Class
 *
 * Emily Greene
 * (821)
 */
public class Student
{
    // instance variables
    private String stuName;
    private int stuNumber;
    
    //constructor
    public Student(String name, int num){
        stuName = name;
        stuNumber = num;
    }
    //methods
    public String getName(){
        return stuName;
    }
    
    public int getNumber(){
        return stuNumber;
    }

}
