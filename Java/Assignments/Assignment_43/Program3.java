import java.util.Scanner;

 class Display
{
    public static int Display(int iNo)  //879
    {
       int iDigit=0;
       int iSum=0;
       while(iNo!=0)
       {
            iDigit=iNo%10;      //9
            iSum=iDigit+iSum;

            iNo=iNo/10;
       }

        return iSum;
    }
}

 public class Program3
{
    public static void main(String[] args) 
    {
         int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        
        int iRet=Display.Display(iValue);
        System.out.println("summation is:"+iRet);
    }
}