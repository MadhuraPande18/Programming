
import java.util.Scanner;

public class program1 
{
    public static void Number(int iNo)
    {   
        if(iNo<50)
        {
            System.out.println("small");
        }

        else if(iNo >= 50 && iNo < 100)
        {
            System.out.println("medium");
        }

        else
        {
            System.out.println("large");
        }

        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int iValue=sobj.nextInt();
        Number(iValue);

        
    }
    
}
