import  java.util.Scanner;
class Program5
{
    public static int ChkBit(int iNo)
    {
        int iMask=0;
        iMask=0X0000000F | 0XF0000000;

        iNo=iNo^iMask;
        return  iNo;
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        int iValue=0;
        iValue=sobj.nextInt();


        int iRet=ChkBit( iValue);
        System.out.println(iRet);

        
    }

}
