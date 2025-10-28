
import java.util.Scanner;



public class ReverseAString{

    public static String Reverse(String str){

    //Approach 1

        /*StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println("Reverse str: "+rev);
        */

    // Approach 2
        /*String rev ="";
        for(int i=str.length()-1;i>=0;i--){
        rev = rev+str.charAt(i);
        //System.out.println(rev);
        
        }*/

    //Approach 3
       String rev ="";
       for(int i =0; i<=str.length()-1;i++){
        rev = str.charAt(i)+rev;
       }

        return rev.toString();
    }

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(Reverse(str));
        
       
        
    }
}