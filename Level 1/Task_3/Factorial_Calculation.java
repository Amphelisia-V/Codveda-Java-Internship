package Task_3;
import java.util.Scanner;
public class Factorial_Calculation {

 public static int factorial(int n){
        if( n==0 || n==1)
        {
            return 1;
        }
        else{
        return n*factorial(n-1);
        }
       
        }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();
       
         if(number<0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else
        {
            System.out.println("Factorial of "+number+" is : "+factorial(number));
        }
        input.close();


    }
}
    

