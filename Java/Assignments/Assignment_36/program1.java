import java.util.Scanner;

class Program1
{
    public static int ChkBit(int iNo)
    {
       int iMask=0;
       iMask=0X40;
        iMask=~iMask;
        iNo=iNo&iMask;

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