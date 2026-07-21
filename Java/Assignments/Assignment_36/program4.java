import java.util.Scanner;

class program4
{
    public static int ChkBit(int iNo)
    {
       int iMask = 0X40 | 0X200;
       iNo=iMask^iNo;
      
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