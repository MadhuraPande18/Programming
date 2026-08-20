import java.util.Scanner;

public class Program4 
{
    public static void main(String[] args) 
    {
        int Units_Consumed=0;
        int bill=0;
        int extra_days=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter units consumed");
       
        Units_Consumed=sobj.nextInt();

        if(Units_Consumed<0)
        {
            System.out.println("\"Error: Units cannot be negative\"");
        }

        else
        {

        if(Units_Consumed<=100)
        {
            bill=Units_Consumed*5;
        }

        else if(Units_Consumed<=200)
        {
            extra_days=Units_Consumed-100;

            bill=extra_days*7+(100*5);

        }

        else
        {
            extra_days=Units_Consumed-200;
            bill=extra_days*10+(100*5)+(100*7);
        }


            System.out.println("Total Units Consumed: " +Units_Consumed);
            System.out.println("Total Electricity Bill: ₹" + bill);
    }


        
    }
    
}
