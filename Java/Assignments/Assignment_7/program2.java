import java.util.Scanner;

public class program2 
{
    public static int DollarToINR(int iNo)
    {
        int iAns=0;
        iAns=iNo*70;
        return iAns;
    }

    public static void main(String[] args) 
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Dollar");
        iValue= sobj.nextInt();

        iRet=DollarToINR(iValue);
        System.out.println(iRet);
        
    }

    
}