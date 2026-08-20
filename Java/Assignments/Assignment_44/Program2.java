import java.util.Scanner;

public class Program2 
{
   
    public static int Largest(int iNo)
    {
       int iLarge=0;
       int iDigit=0;
       if(iNo>0)
       {
            iDigit=iNo%10;
            if(iDigit>iLarge)
            {
                iLarge=iDigit;
            }

            Largest(iNo/10);
       }
       
       return iLarge;

        
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("Enter number");
        iValue=sobj.nextInt();

        int iRet=Largest(iValue);
        System.out.println(iRet);
        
    }
    
}
