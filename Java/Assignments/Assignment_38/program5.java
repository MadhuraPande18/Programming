
import java.util.Scanner;

class program5
{
    public static int CountOne(int iNo,int iStart,int iEnd)
    {
        int iMask = 0;

    for(int i = iStart; i <= iEnd; i++)
    {
        iMask = iMask | (1 << (i - 1));
    }

    return iNo ^ iMask;
}
    
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in) ;
        System.out.println("Enter the 1st number");
        int iValue1=0;
        iValue1=sobj.nextInt();

        System.out.println("Enter the start");
        int iPos1=0;
        iPos1=sobj.nextInt();

        System.out.println("Enter the end");
        int iPos2=0;
        iPos2=sobj.nextInt();
        
       int iRet = CountOne(iValue1, iPos1, iPos2);
        System.out.println(iRet);

    }

}