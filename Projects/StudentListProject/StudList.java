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
    //deletes a student based on their last name
    public void deleteStudent(String lastName){
         for(int i = 0; i < studentList.size(); i++){
            if(lastName.equals(studentList.get(i).getLName())){
                studentList.remove(i);
            }
         }
    }
    //deletes a student based on their student number
    public void deleteStudent(int stuNumber){
        for(int i = 0; i < studentList.size(); i++){
            if(stuNumber == studentList.get(i).getNumber()){
                studentList.remove(i);
            }
        }
    }
    //allows the user to edit a student's name or GPA (by entering their last name)
    public void editStudentList(String lastName){
        for(int i = 0; i < studentList.size(); i++){
            if(lastName.equals(studentList.get(i).getLName())){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: " + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
                Scanner kb2 = new Scanner(System.in);
                System.out.println("Enter the student's information to edit it \n Student Name: ");
                String newName = kb2.nextLine();
                System.out.println("Student Number: ");
                int newNum = kb2.nextInt();
                System.out.println("Student GPA: ");
                double newGPA = kb2.nextDouble();
                
                Student editStudent = new Student(newName, newNum, newGPA);
                studentList.set(i, editStudent);
            }
        }
    }
    //allows the user to edit a student's name or GPA (by entering their number)
    public void editStudentList(int stuNumber){
        for(int i = 0; i < studentList.size(); i++){
            if(stuNumber == studentList.get(i).getNumber()){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: " + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
                Scanner kb2 = new Scanner(System.in);
                System.out.println("Enter the student's information to edit it \n Student Name: ");
                String newName = kb2.nextLine();
                System.out.println("Student Number: ");
                int newNum = kb2.nextInt();
                System.out.println("Student GPA: ");
                double newGPA = kb2.nextDouble();
                
                Student editStudent = new Student(newName, newNum, newGPA);
                studentList.set(i, editStudent);
            }
        }
    }
    //clears all students from the student list
    public void clearList(){
       for(int i = 0; i < studentList.size(); i++){
           studentList.remove(i);
       }
    }
    //prints one student (after the user types their last name)
    public void printStudent(String lastName){
        for(int i = 0; i < studentList.size(); i++){
            if(lastName.equals(studentList.get(i).getLName())){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: "  + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
            }
        }
    }
    //prints one student (after the user types their number)
    public void printStudent(int stuNumber){
       for(int i = 0; i < studentList.size(); i++){
            if(stuNumber == studentList.get(i).getNumber()){
                System.out.println("Student Name: " + studentList.get(i).getName());
                System.out.println("Student Number: "  + studentList.get(i).getNumber());
                System.out.println("Student GPA: " + studentList.get(i).getGPA());
            }
       }
    }
    //sorts student list in alpahbetical order based on last name
    public void sortStudents(String lastName){
        for(int i = 1; i < studentList.size(); i++){
            int j = i;
            while(j > 0 && (studentList.get(j).getLName().compareTo(studentList.get(j-1).getLName()))<0){
                swapList(j, j-1);
                j = j-1;
            }
        }
    }
    //sorts student list in numerical order based in student number
    public void sortStudents(int stuNumber){
        for(int i = 1; i < studentList.size(); i++){
            int j = i;
            while(j > 0 && (studentList.get(j).getNumber() < studentList.get(j-1).getNumber())){
                swapList(j, j-1);
                j = j -1;
            }
        }
    }
    //code for swapping students in the student list
    public void swapList(int smaller, int bigger){
        Student temp = studentList.get(smaller);
        studentList.set(smaller, studentList.get(bigger));
        studentList.set(bigger, temp);
    }
    //returns an arraylist of all students whose number is less than or equal to the inputted student number
    public ArrayList<Student> filterSearchStudentList(int keyNums){
        ArrayList<Student> nums = new ArrayList<Student>();
        int exist = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getNumber() <= keyNums){
                Student s = new Student(studentList.get(i).getName(), studentList.get(i).getNumber(), studentList.get(i).getGPA());
                nums.add(s);
            }else{
                exist++;
            }
        }
        for(int i = 0; i < nums.size(); i++){
           System.out.println("Student Name: " + nums.get(i).getName());
           System.out.println("Student Number: "  + nums.get(i).getNumber());
           System.out.println("Student GPA: " + nums.get(i).getGPA());
        }
        if(exist == studentList.size()){
            System.out.println("No such student exists.");
        }
        return nums;
    }
    //returns an arraylist of all students whose GPA is less than or equal to the inputted GPA
    public ArrayList<Student> filterSearchStudentList(double keyGPA){
      ArrayList<Student> gpa = new ArrayList<Student>();
      int exist = 0;
      for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getGPA() <= keyGPA){
                Student s = new Student(studentList.get(i).getName(), studentList.get(i).getNumber(), studentList.get(i).getGPA());
                gpa.add(s);
            }else{
                exist++;
            }
      }
      for(int i = 0; i < gpa.size(); i++){
           
           System.out.println("Student Name: " + gpa.get(i).getName());
           System.out.println("Student Number: "  + gpa.get(i).getNumber());
           System.out.println("Student GPA: " + gpa.get(i).getGPA());
            
        }
      if(exist == studentList.size()){
          System.out.println("No such student exists.");
        }
      return gpa;
    }
}
