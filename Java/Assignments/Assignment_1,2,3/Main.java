public class Main
{
    public static int divide(int iNo1,int iNo2)
    {
        int iAns=0;

        if(iNo2==0)
        {
            return -1;
        }

        iAns=iNo1/iNo2;
        return iAns;
    }

public static void main(String[]args)
{
    int iVal1=12;
    int iVal2=3;
    int iRet=divide(iVal1,iVal2);
    System.out.println("Division is:"+iRet);

}

}