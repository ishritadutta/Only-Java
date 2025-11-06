
import java.util.Scanner;

public class FibonacciSeries{

    public static boolean Fibonacci(int num){

        int a=0, b=1; //taking first two fibonacci numbers 0 and 1

        if(a==num || b==num){ //if num is either 0 or 1 then that is directly a fibonacci number
        return true;
        }

        while(b<num){         
            int c = a+b; //next fibonacci number
            a=b;            // a move to b
            b=c;            // b move to a
                
       
        if(b==num){
            return true; //num is a fibonnacci number
        }
       
        }
        return false;  //num is not a fibonnacci number

    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(Fibonacci(num)){
                System.out.println(num+" is a Fibonacci number");
        }else{
            System.out.println(num+" is not a Fibonacci number");
        }
        sc.close();

    }
}