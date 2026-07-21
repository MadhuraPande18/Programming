import java.util.Scanner;

class program5
{
    public static int ChkBit(int iNo)
    {
       int iMask = 0X1 | 0X2 | 0X4 | 0X8;
       //or iMask=0X0f

       iNo=iMask|iNo;
      
    return iNo;
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int iVal = sobj.nextInt();
        int iRet=ChkBit(iVal);
        System.out.println(iRet);

        sobj.close();
    }
}