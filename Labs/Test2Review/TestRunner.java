
/**
 * Write a description of class TestRunner here.
 *
 * @author (Emily Greene)
 * @version (109)
 */
public class TestRunner
{
   String str = "I love puppies";
   public TestRunner()
   {
     index();
   }
   public void index(){
       System.out.println(str.indexOf("puppies"));
   }
   public static int[] reverseArray(int[] n){
       int[] newArray = new int[n.length];
       for(int i = 0; i < n.length; i++){
           newArray[i] = n[(n.length - 1) - i];
        }
       return newArray;
   }
   public static boolean numberArray(int[] n, int num){
       for(int i = 0; i < n.length; i++){
           if(n[i] == num){
               return true;
            }
        }
        return false;
   }
   public static void strFunctions(){
       String str = "199 Churchill Ave. Woodside CA, 94062";
       System.out.println(str.substring(12));
       System.out.println(str.substring(14, 15));
       System.out.println(str.indexOf("Woody"));
       System.out.println(str.substring(str.indexOf("4")));
       System.out.println(str.substring(str.indexOf("CA")));
       System.out.println(str.substring(str.indexOf("W"), str.indexOf("W")+9));
       System.out.println(str.indexOf(str.substring(2, 4)+1));
       String str2 = str.substring(str.indexOf("Woodside"));
       System.out.println(str2.substring(str2.indexOf(" ")));
   }
   public static void nestedLoop(){
      for(int i = 3; i > 0 ; i--){
        for(int j = 0; j < i; j++){
            System.out.print(", " + j);
        }
        System.out.println();
      }
   }
   public static String transformIHaveA(String noun){
       String[] response = {"Why do you have a ",
                            "How long have you had a ",
                            "What color is your ",
                            "When did you get your "};
       int x = (int)(Math.random()* response.length);
       String s = response[x];
       return s + noun;
   }
}
