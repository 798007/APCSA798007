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
        while(!inputStr.equals("quit")){ //keeps the program running until they quit
            //loading the menu
            System.out.println("Enter a number from the menu or type \"quit\" to quit.");
            System.out.println("1. Add Student\n2. Delete Student\n3. Print Student List");
            System.out.println("4. Search For Student\n5. Clear Student List\n6. Sort Student List;");
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
            if(inputStr.equals("4")){ //search for a student
                System.out.println("Type \"1\" if you want to search for a student through their GPA's or type \"2\" to search through their number.");
                int inputValue = kb.nextInt();
                Scanner kb2 = new Scanner(System.in);
                if(inputValue == 1){
                    System.out.println("Enter the maximum GPA you want to use to filter the students.");
                    double GPA = kb2.nextDouble();
                    studList.filterSearchStudentList(GPA);
                }
                if(inputValue == 2){
                    System.out.println("Enter the highest student number you want to use to filter the students.");
                    int num = kb2.nextInt();
                    studList.filterSearchStudentList(num);
                }
            }
            if(inputStr.equals("5")){ //clears student list
                studList.clearList();
            }
            if(inputStr.equals("6")){ //sorts students
                System.out.println("Type \"1\" if you want to sort the students by their last names or type \"2\" if you want to sort them by their numbers.");
                int inputValue = kb.nextInt();
                Scanner kb2 = new Scanner(System.in);
                if(inputValue == 1){
                    studList.sortStudents("LastName");
                }
                if(inputValue == 2){
                    studList.sortStudents(1);
                }
            }
            if(inputStr.equals("7")){ //print 1 student
                System.out.println("Type \"1\" if you want to print a student through their last name or type \"2\" to print them through their number.");
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
            if(inputStr.equals("8")){ //edit a student
                System.out.println("Type \"1\" if you want to edit a student through their last name or type \"2\" to edit them through their number.");
                int inputValue = kb.nextInt();
                Scanner kb2 = new Scanner(System.in);
                if(inputValue == 1){
                    System.out.println("Type the student's last name");
                    String lName = kb2.nextLine();
                    studList.editStudentList(lName);
                }
                if(inputValue == 2){
                    System.out.println("Type the student's number");
                    int num = kb2.nextInt();
                    studList.editStudentList(num);
                }
            }
        }
    }
}
