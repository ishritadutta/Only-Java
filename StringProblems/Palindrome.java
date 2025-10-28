public class Palindrome{

    public static String IsPalindrome(String str){
        
        //Approach 1
       String sb = new StringBuilder(str)
                        .reverse()
                        .toString();

        if(str.equals(sb)){
        System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
        

        return IsPalindrome(str+" is Plaindrome");

        //Approch 2

    }



    public static void main(String[] args) {
        String str = "madam";
           
        
    }
}