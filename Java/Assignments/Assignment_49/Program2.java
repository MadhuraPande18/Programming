import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        int Age = 0;
        int income = 0;
        int credit_score = 0;
        String Existing_loan;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Age:");
        Age = sobj.nextInt();

        System.out.println("Credit score:");
        credit_score = sobj.nextInt();

        System.out.println("Income:");
        income = sobj.nextInt();

        System.out.println("Existing loan (Yes/No):");
        Existing_loan = sobj.next();

        if (credit_score < 0 || Age < 0 || income < 0)
        {
            System.out.println("Must be greater than 0");
        }
        else if (!(Existing_loan.equals("Yes") || Existing_loan.equals("No")))
        {
            System.out.println("Yes/No must be valid");
        }
        else if (Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if (income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income below 25000");
        }
        else if (credit_score < 700)
        {
            System.out.println("Loan Rejected: Credit score below 700");
        }
        else if (Existing_loan.equals("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan present");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}