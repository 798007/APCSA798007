import java.util.*;
/**
 * StudList
 *
 * @author (Emily Greene)
 * @version (1025)
 */
public class StudList
{
    ArrayList<Student> studentList = new ArrayList<Student>();
    public StudList()
    {
       
    }
    public void addStudentToList(){
        Scanner kb = new Scanner(System.in);
        String inputName = "";
        int inputNumber;
        double inputGPA;
        
        System.out.println("Student Name: ");
        inputName = kb.nextLine();
        
        System.out.println("Student Number: ");
        inputNumber = kb.nextInt();
        
        System.out.println("Student GPA: ");
        inputGPA = kb.nextDouble();
        
        Student student = new Student(inputName, inputNumber, inputGPA);
        studentList.add(student);
    }
    public void printStudentList(){
        for(int i = 0; i < studentList.size(); i++){
            System.out.println("Student Name: " + studentList.get(i).getName());
            System.out.println("Student Number: "  + studentList.get(i).getNumber());
            System.out.println("Student GPA: " + studentList.get(i).getGPA());
        }
    }
   /* public void parseUserInput(String fullName, Student stud){
        int comma = fullName.indexOf(",");
        int space = fullName.indexOf(" ");
        int space2 = fullName.lastIndexOf(" ");
        //format one
        if(comma != -1 & space != space2){
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma+1, space2);
            mName = fullName.substring(space2 + 1);
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
    
    
   */
    //public void deleteStudent(String lastName){
    
    //}
    //public void deleteStudent(int stuNumber){
    
    //}
    //public void editStudentList(String lastName){
    
    //}
    //public void editStudentList(int stuNumber){
    
   // }
   // public void clearList(){
    
    //}
    //public void printList(){
    
    //}
    //public void printStudent(String lastName){
    
    //}
   // public void printStudent(int stuNumber){
    
    //}
    //public void sortStudents(String lastName){
    
    //}
    //public void sortStudents(int stuNumber){
    
    //}
    //public ArrayList<Student> filterSearchStudentList(String key){
    
    //}
}
