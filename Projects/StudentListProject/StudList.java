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
        //gets input information for each students' name, number, and gpa
        System.out.println("Student Name: ");
        inputName = kb.nextLine();
        
        System.out.println("Student Number: ");
        inputNumber = kb.nextInt();
        
        System.out.println("Student GPA: ");
        inputGPA = kb.nextDouble();
        
        //creates a new student object loaded with the name, number, and gpa
        Student student = new Student(inputName, inputNumber, inputGPA);
        //adds the new student object to the arraylist of student objects
        studentList.add(student);
    }
    //prints out each student's name, number, and gpa
    public void printStudentList(){
        for(int i = 0; i < studentList.size(); i++){
            System.out.println("Student Name: " + studentList.get(i).getName());
            System.out.println("Student Number: "  + studentList.get(i).getNumber());
            System.out.println("Student GPA: " + studentList.get(i).getGPA());
        }
    }
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
