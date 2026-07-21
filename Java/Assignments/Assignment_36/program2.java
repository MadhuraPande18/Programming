import java.util.Scanner;

class program2
{
    public static int ChkBit(int iNo)
    {
       int iMask1 = ~0x200;   // 10th bit OFF mask
        int iMask2 = ~0x40;    // 7th bit OFF mask

        iNo = iNo & iMask1;
        iNo = iNo & iMask2;

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