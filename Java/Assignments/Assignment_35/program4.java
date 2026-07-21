 import java.util.Scanner;

class program4
{
    public static boolean ChkBit(int iNo)
    {
        int iMask1=0;
        int iMask2=0;
        int iMask3=0;

        iMask1=0X40;
        iMask2=1<<7;
        iMask3=0X100;

        if(((iNo&iMask1)==iMask1) &&
        ((iNo&iMask2)==iMask2) &&
        ((iNo&iMask3)==iMask3))
        
        {
            return true;
        }

        else
        {
            return false;
        }

    }
    public static void main(String[] args) 
    {
        int iVal=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Number");
        iVal=sobj.nextInt();

        boolean iRet=false;
        iRet=ChkBit(iVal);
        if(iRet==true)
        {
            System.out.println("Its ON");
        }

        else
        {
            System.out.println("Its off");
        }

        
    }
   
}
