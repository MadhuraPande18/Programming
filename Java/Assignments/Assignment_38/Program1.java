
import java.util.Scanner;

class Program1
{
    public static int CountOne(int iNo)
    {
        int iCount=0;
        while(iNo!=0)
        {
            if((iNo&1)==1)
            {
                iCount++;
            }
        iNo=iNo>>1;
        }
        return iCount;
    }
    
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in) ;
        System.out.println("Enter the number");
        int iValue=0;
        iValue=sobj.nextInt();
        int iRet=CountOne(iValue);
        System.out.println("Output is:"+iRet);



    }

}