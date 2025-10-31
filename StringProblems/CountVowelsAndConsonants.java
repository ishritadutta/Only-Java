
import java.util.Scanner;

public class CountVowelsAndConsonants{

public static String VowelConsonantTracker(String str){
    
    int j=0;
    int k=0;
    for(int i=0; i<str.length();i++){
        if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
            j++;
            
        }
        else if(Character.isLetter(str.charAt(i))){
            k++;
            
        }
        else{
            System.out.println("Neither Vowel Nor Consonant");
        }

        
    }
    System.out.println("Vowel Count: " + j);
    System.out.println("Consonanats Count: " + k);
    
    return "checked";

}


public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a text: ");
    String str = sc.nextLine();
    str = str.replaceAll("\\s+","").toLowerCase();

    System.out.println(VowelConsonantTracker(str));

}

}