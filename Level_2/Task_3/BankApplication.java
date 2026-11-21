package Level_2.Task_3;
import java.util.Scanner;
public class BankApplication {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.print("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        while(true)
        {
            System.out.println("Bank Application Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance:" + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
