public class Palindrome{

    public static String IsPalindrome(String str){
        
       String sb = new StringBuilder(str)
                        .reverse()
                        .toString();

        System.out.println(str.equals(sb));

        return "Palindrome";
    }



    public static void main(String[] args) {
        String str = "madam";
        
        
    }
}