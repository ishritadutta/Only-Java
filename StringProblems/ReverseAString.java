

public class ReverseAString{

    public static String Reverse(String str){

    //Approach 1

        StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println("Reverse str: "+rev);
        

    // Approach 2
        /*String rev ="";
        for(int i=str.length()-1;i>=0;i--){
        rev = rev+str.charAt(i);
        //System.out.println(rev);
        
        }*/

        return rev.toString();
    }

    public static void main(String[] args) {

        String str = "Ishrita";

        System.out.println(Reverse(str));
        
       
        
    }
}