import java.util.*;
/**
 * Lab 1031: StringCheck
 *
 * @author (Emily Greene)
 * @version (1031)
 */
public class StringCheck
{
    public StringCheck()
    {
    }
    public static void main(){
        ArrayList<String> words = new ArrayList<String>();
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        String keyword = "";
        System.out.println("Type in a list of words, or type \"done\" to stop adding words.");
        //adds any inputs to the words arraylist until the user is done
        while(!inputStr.equals("done")){
            inputStr = kb.nextLine();
            words.add(inputStr);
        }
        if(inputStr.equals("done")){
            System.out.println("What keyword are you looking for?");
            keyword = kb.nextLine();
        }
        System.out.println("Arraylist to Array: ");
        wordChecker(words, keyword);
        String[] array = new String[words.size()];
        for(int i = 0; i < words.size(); i++){
            array[i] = words.get(i);
        }
        System.out.println("\nArray to Arraylist: ");
        wordChecker(array, keyword);
    
    }
    //takes in an array, returns an arraylist of the input words that
    //contain the keyword
    public static ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            if(str[i].indexOf(key) != -1){
                list.add(str[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
        return list;
    }
    //takes in an arraylist, returns an array of the input words that
    //contain the keyword
    public static String[] wordChecker(ArrayList<String> str, String key){
        String[] list = new String[str.size()];
        for(int i = 0; i < str.size(); i++){
            if(str.get(i).indexOf(key) != -1){
                list[i] = str.get(i);
            }
        }
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                System.out.print(list[i] + ", ");
            }
        }
        return list;
    }
}
