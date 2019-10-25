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
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            System.out.println("Enter a number from the menu or type \"quit\" to quit.")
            
            inputStr = kb.nextLine();
        }
      
        
        
        studList.addStudentToList();
        studList.deleteStudentFromList();
        studList.editStudentList();
        studList.clearList();
        studList.printAll();
        studList.printStudent();
        studList.sortStudents();
    
    
    }
}
