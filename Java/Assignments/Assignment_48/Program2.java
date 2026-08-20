import java.util.Scanner;

public class Program2 
{
    public static void main(String[] args) 
    {
        int Withdrawal_amt = 0;
        int Current_balance = 0;
        int NewBalance = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter current balance:");
        Current_balance = sobj.nextInt();

        System.out.println("Enter withdrawal amt:");
        Withdrawal_amt = sobj.nextInt();

        if(Current_balance < 0 || Withdrawal_amt <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if(Withdrawal_amt % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of Rs.100.");
        }
        else if(Withdrawal_amt > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal limit is Rs.25000.");
        }
        else
        {
            NewBalance = Current_balance - Withdrawal_amt;

            if(NewBalance < 1000)
            {
                System.out.println("Transaction Failed: Balance must remain at least Rs.1000.");
            }
            else
            {
                System.out.println("Transaction Successful.");
                System.out.println("Remaining Balance: Rs." + NewBalance);
            }
        }
    }
}