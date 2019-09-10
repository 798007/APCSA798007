
/**
 * StudentRunner Class
 *
 * @Emily Greene
 * (821)
 */
public class StudentRunner
{
   public static void main(){
       Student s1 = new Student("Emily", 1234);
       System.out.println(s1.getName() + ", " + s1.getNumber());
       
       Student s2 = new Student("Isabelle", 5678);
       System.out.println(s2.getName() + ", " + s2.getNumber());
       
       Student s3 = new Student("Will", 91011);
       System.out.println(s3.getName() + ", " + s3.getNumber());
    }
}
