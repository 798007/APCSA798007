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
    public void deleteStudent(String lastName){
         for(int i = 0; i < studentList.size(); i++){
            if(lastName.equals(studentList.get(i).getLName())){
                studentList.remove(i);
            }
         }
    }
    public void deleteStudent(int stuNumber){
        for(int i = 0; i < studentList.size(); i++){
            if(stuNumber == studentList.get(i).getNumber()){
                studentList.remove(i);
            }
        }
    }
    public void editStudentList(String lastName){
        System.out.println("Type \"1\" if you want to edit the student's name or type \"2\" if you want to edit their GPA.");
        Scanner kb = new Scanner(System.in);
        int inputValue = kb.nextInt();
        if(inputValue == 1){
            System.out.println("Enter the student's full updated name: ");
            String newName = kb.nextLine();
            for(int i = 0; i < studentList.size(); i++){
                if(lastName.equals(studentList.get(i).getName())){
                    //studentList.set(i, newName);
                    
                }
            }
            
        }
        if(inputValue == 2){
            System.out.println("Enter the student's new GPA: ");
        }
    }
    //public void editStudentList(int stuNumber){
    
    // }
    public void clearList(){
       for(int i = 0; i < studentList.size(); i++){
           studentList.remove(i);
       }
    }
   
    public void printStudent(String lastName){
        for(int i = 0; i < studentList.size(); i++){
            if(lastName.equals(studentList.get(i).getLName())){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: "  + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
            }
        }
    }
    public void printStudent(int stuNumber){
       for(int i = 0; i < studentList.size(); i++){
            if(stuNumber == studentList.get(i).getNumber()){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: "  + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
            }
       }
    }
    //public void sortStudents(String lastName){
        
    //}
    public void sortStudents(int stuNumber){
        for(int i = 1; i < studentList.size(); i++){
            int j = i;
            while(j > 0 && (studentList.get(j).getNumber() < studentList.get(j-1).getNumber())){
                int smallerNumber = studentList.get(j).getNumber();
                //swap
                j = j -1;
            }
        }
    }
    //public ArrayList<Student> filterSearchStudentList(String key){
    
    //}
}
