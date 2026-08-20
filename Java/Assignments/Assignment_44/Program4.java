import java.util.Scanner;

public class Program4
{
    static  int iSmall=9;
    public static int Smallest(int iNo)
    {
       if(iNo!=0)
       {
            int iDigit=iNo%10;
           
            if(iSmall>iDigit)
            {
                iSmall=iDigit;
            }

            Smallest(iNo/10);

       }

       return iSmall;
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("Enter number");
        iValue=sobj.nextInt();

        int iRet=Smallest(iValue);
        System.out.println(iRet);
        
    }
    
}
