
import java.util.Scanner;

public class FactorialOfNumber{

public static int Factorial(int num){
    int fact =1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    return fact;

}


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    System.out.println(Factorial(num));
}
}