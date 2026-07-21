import java.util.Scanner;

class Program3
{
    public static int ChkBit(int iNo)
    {
       int iMask1 = 0X40;
       iNo=iMask1^iNo;
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