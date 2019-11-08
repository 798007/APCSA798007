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
            if(inputStr.equals("1")){
                studList.addStudentToList();
            }
            if(inputStr.equals("3")){
                studList.printStudentList();
            }
            //if(inputStr.equals("2")){
            //    studList.deleteStudentFromList();
            //}
        }
      
        
        //studList.deleteStudentFromList();
        //studList.editStudentList();
        //studList.clearList();
        //studList.printAll();
        //studList.printStudent();
        //studList.sortStudents();
    
    
    }
}
