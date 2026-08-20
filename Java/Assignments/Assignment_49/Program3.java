import java.util.Scanner;

public class Program3 
{
    public static void main(String[] args) 
    {
        int Stock=0;
        int qnt=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Current Stock:");
        Stock = sobj.nextInt();

        System.out.println("Enter Requested Quantity:");
        qnt=sobj.nextInt();

        if(Stock<0)
        {
            System.out.println("Stock cannot be negative it must be greater than 0");
        }

        else if(qnt>Stock)
        {
            System.out.println("Order Failed:Insufficient Stock");
        }

        else if(Stock<5)
        {
            System.out.println("Low Stalk alert");
        }

        else
        {
            System.out.println("Order Processed successfully");
            int Remaining_Stock=Stock-qnt;
            System.out.println("Remaining stock is"+Remaining_Stock);
        }

    }
    
}
