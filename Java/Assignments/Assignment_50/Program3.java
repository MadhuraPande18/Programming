import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) 
    {    
        int Weight=0;
        int Amount=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Weight");
    
    Weight=sc.nextInt();

    if(Weight<0)
    {
        System.out.println("Invalid");
    }

    else
    {
        if(Weight<=1)
        {
            Amount=50;
        }

        else if(Weight<=5)
        {
            int Extra=Weight-1;
            Amount=50+20*Extra;
        }

        else
        {
            int Extra=Weight-5;
            Amount=150+Extra*30;

        }


        System.out.println(Amount);
    }

  
    }
}

