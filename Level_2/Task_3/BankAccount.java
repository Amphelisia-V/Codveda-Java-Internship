package Level_2.Task_3;

public class BankAccount {
     private double balance =0.0;
      public BankAccount(double initialBalance)
    {
        //နောက်ပိုင်း constructor parameter ကိုဆိုရင် Java က ဘယ် balance ကိုဆိုလိုလဲ ရှုပ်နိုင်ပါတယ်။
        this.balance=initialBalance;
    }
    public void deposit(double amount)
    {
        if(amount> 0)
        {
            balance+=amount;
            System.out.println("Deposited:"+ amount);
            System.out.println("New Balance:"+ balance);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawn:"+ amount);
            System.out.println("New Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
    public double checkBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
       BankAccount account= new BankAccount(1000.0);
        // call deposit method
        account.deposit(500.0);
        //call withdraw method
        account.withdraw(1000);
        //call checkBalance method
        System.out.println("Final Balance:"+ account.checkBalance());

    }
}
