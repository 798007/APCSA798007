import java.util.*;
/**
 * StudListRunner
 *
 * @author (Emily Greene)
 * @version (1025)
 */
public class StudListRunner
{
    public StudListRunner()
    {
        
    }
    public static void main(){
        StudList studList = new StudList();
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            //loading the menu
            System.out.println("Enter a number from the menu or type \"quit\" to quit.");
            System.out.println("1. Add Student\n2. Delete Student\n3. Print Student List");
            System.out.println("4. Search For Student\n5. Clear Student List\n6. Sort Student List);");
            System.out.println("7. Print 1 Student\n8. Edit Student List");
            inputStr = kb.nextLine();
            if(inputStr.equals("1")){ //add student
                studList.addStudentToList();
            }
            if(inputStr.equals("2")){ //delete student
                System.out.println("Type \"1\" if you want to delete a student by their last name or type \"2\" if you want to delete them by their number.");
                int inputValue = kb.nextInt();
                Scanner kb2 = new Scanner(System.in);
                if(inputValue == 1){
                    System.out.println("Type the student's last name");
                    String lName = kb2.nextLine();
                    studList.deleteStudent(lName);
                }
                if(inputValue == 2){
                    System.out.println("Type the student's number");
                    int num = kb2.nextInt();
                    studList.deleteStudent(num);
                }
            }
            if(inputStr.equals("3")){ //prints all students
                studList.printStudentList();
            }
            if(inputStr.equals("4")){
            
            }
            if(inputStr.equals("5")){
                studList.clearList();
            }
            if(inputStr.equals("6")){
            
            }
            if(inputStr.equals("7")){
                System.out.println("Type \"1\" if you want to print a student by their last name or type \"2\" if you want to print them by their number.");
                int inputValue = kb.nextInt();
                Scanner kb2 = new Scanner(System.in);
                if(inputValue == 1){
                    System.out.println("Type the student's last name");
                    String lName = kb2.nextLine();
                    studList.printStudent(lName);
                }
                if(inputValue == 2){
                    System.out.println("Type the student's number");
                    int num = kb2.nextInt();
                    studList.printStudent(num);
                }
            }
            if(inputStr.equals("8")){
            
            }
        }
    }
}
