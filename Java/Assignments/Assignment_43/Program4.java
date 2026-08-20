import java.util.Scanner;

 class Display
{
    public static int Factorial(int iNo)  
    {
       
        if(iNo==0)
        {
            return 1;
        }

        return iNo*Factorial(iNo-1);
    }

   
}

 public class Program4
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        
        int iRet=0;
        iRet=Display.Factorial(iValue);
        System.out.println(iRet);
    }
}