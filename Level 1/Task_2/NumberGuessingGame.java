package Task_2;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    public static void main(String[] args) {
      
        Random random=new Random();
        Scanner input = new Scanner(System.in);
        int answer= random.nextInt(100)+1;
        int attempt=0;
        int maxAttempts=5;
       
        int guess=0;
        while( answer!=guess && attempt < maxAttempts)
        {
             
        System.out.println("Guess a Number: ");
        if(input.hasNextInt())
        {
            guess= input.nextInt();
            attempt++;
             if(guess>answer)
            {
                System.out.println("Too high");
            }
            else if(guess<answer)
            {
                 System.out.println("Too low");
            }
            else
            {
                System.out.println("Correct! You Win :)");
            }
        }
        else{
            System.out.println("Invalid! Please enter a number.");
            attempt++;
            input.next();
        }
           
        } 
        if( attempt== maxAttempts && guess!= answer)
        {
            System.out.println("Game Over! :(");
            System.out.println("The answer was "+ answer);
        }
        input.close();
    }
}