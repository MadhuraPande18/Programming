import java.util.Scanner;

class Program1
{
    public static boolean ChkBit(int iNo,int iPos)
    {
        int iMask=0;
        iMask= 1 << (iPos-1);
        if
        (
            (iNo&iMask)==iMask
            
        )
        {
            return  true;
        }
    return  false;
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        int iValue=0;
        iValue=sobj.nextInt();

        int iLocation=0;
        iLocation=sobj.nextInt();

        boolean iRet=ChkBit( iValue,iLocation);

        if(iRet==true)
        {
            System.out.println("Its on");
        }
        
        else
        {
            System.out.println("its off");
        }
    }
}