//automatic fine calculator
import java.util.Scanner;
public class Program1
{
    public static void main(String[] args) 
    {
        int daysKept=0;
        int Extra_Kept=0;
        int fine=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter days kept");

        daysKept=sobj.nextInt();

        if(daysKept<0)
        {
            System.out.println("Invalid input");
        }

        else if(daysKept<=7)
        {
            System.out.println("Returned on time.No fine applicable");
        }

        else if(daysKept<=12)
        {
            Extra_Kept=daysKept-7;
            //5 rupes per day
           fine =Extra_Kept * 5;

            System.out.println("Total fine to be paid: ₹" + fine);      
        }

        else
        {
            //12 rupees per day
            Extra_Kept=daysKept-12;     //ex.16 days=16-12=4 days extra
            fine=Extra_Kept*10+25;
            System.out.println("Fine for above 12 days is  "+fine);

         
        }


    }
}

