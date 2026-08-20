import java.util.Scanner;

public class Program5
{
    public static void main(String[] args) 
    {
        int Income = 0;
        double Total_Tax = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter annual income:");
        Income = sobj.nextInt();

        if (Income < 0)
        {
            System.out.println("Income cannot be negative");
        }
        else
        {
            if (Income <= 250000)
            {
                Total_Tax = 0;
            }
            else if (Income <= 500000)
            {
                Total_Tax = (Income - 250000) * 0.05;
            }
            else if (Income <= 1000000)
            {
                Total_Tax = (500000 - 250000) * 0.05
                          + (Income - 500000) * 0.20;
            }
            else
            {
                Total_Tax = (500000 - 250000) * 0.05
                          + (1000000 - 500000) * 0.20
                          + (Income - 1000000) * 0.30;
            }

            System.out.println("Total Tax: " + Total_Tax);
        }

        sobj.close();
    }
}