import  java.util.Scanner;
class program4
{
    public static int ChkBit(int iNo,int iPos)
    {
        int iMask=0;
        iMask= 1 << (iPos-1);

        iNo=iNo^iMask;
        return  iNo;
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        int iValue=0;
        iValue=sobj.nextInt();

        System.out.println("Enter position");
        int iLocation=0;
        iLocation=sobj.nextInt();

        int iRet=ChkBit( iValue,iLocation);
        System.out.println(iRet);

        
    }

}
