import java.util.Scanner;

public class Program5 
{
    static int reverse = 0;

    public static int Reverse(int iNo)
    {
        
        if(iNo>0)
        {
           int iDigit=iNo%10;

           reverse=reverse*10+iDigit;

           Reverse(iNo/10);
        }
        return  reverse;
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        int iRet=0;
        System.out.println("Enter number");
        iValue=sobj.nextInt();
        iRet=Reverse(iValue);
       
        System.out.println(iRet);
        
    }
    
}
