import java.util.Scanner;

public class program3 
{
    public static void DisplayNonFactors(int iNo)
    {   
        for(int i=1;i<=iNo;i++)
        {
            if((iNo%i) != 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) 
    {
        int iValue;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        DisplayNonFactors(iValue);

        
    }
    
}
