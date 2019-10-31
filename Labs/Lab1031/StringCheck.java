import java.util.*;
/**
 * StringCheck
 *
 * @author (Emily Greene)
 * @version (1031)
 */
public class StringCheck
{
    static int numWords = 0;
    static int numKey = 0;
    public StringCheck()
    {
    }
    public static void main(){
        ArrayList<String> words = new ArrayList<String>();
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        String keyword = "";
        System.out.println("Type in a list of words, or type \"done\" to stop adding words.");
        while(!inputStr.equals("done")){
            inputStr = kb.nextLine();
            words.add(inputStr);
            numWords++;
        }
        if(inputStr.equals("done")){
            System.out.println("What keyword are you looking for?");
            keyword = kb.nextLine();
            for(int i = 0; i < words.size(); i++){
                if(words.get(i).indexOf(keyword) != -1){
                    numKey++;
                }
            }
        }
        wordChecker(words, keyword);
        
    
    }
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
        System.out.println(list);
        return list;
    }
    public static String[] wordChecker(ArrayList<String> str, String key){
        String[] list = new String[numKey];
        for(int i = 0; i < str.size(); i++){
            if(str.get(i).indexOf(key) != -1){
                list[i] = str.get(i);
            }
        }
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        return list;
    }
}
