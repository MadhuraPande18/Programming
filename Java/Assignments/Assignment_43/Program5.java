import java.util.Scanner;

 class Display
{
    public static int Product(int iNo)  //523
    {
        int iDigit=0;
        int iProd=1;
        if(iNo==0)
        {
            return 1;
        }

        return (iNo%10)*Product(iNo/10);
    }

   
}

 public class Program5
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        
        int iRet=0;
        iRet=Display.Product(iValue);
        System.out.println(iRet);
    }
}