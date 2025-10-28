
import java.util.Scanner;

public class Palindrome{

public static String PalindromeCheck(String str){

        //Approach 1

        /*String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
        System.out.println("Palindrome");
        }
        else{
        System.out.println("Not Palindrome");
        }
       
        */
        //Approach 2
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len - i -1)){
                System.out.println("Not Palindrome");
            }
            else{
                System.out.println("Palindrome");
            }


        }


        return "";
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+","").toLowerCase();

        System.out.println(PalindromeCheck(str));

        


           
        
    }
}