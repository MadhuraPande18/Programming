//count common on bits
import java.util.Scanner;

class program4
{
    public static boolean  CountOne(int iNo,int iLoc1,int iLoc2)
    {
        int iMask1=1<<(iLoc1-1);
        int iMask2=1<<(iLoc2-1);
        int iMask=iMask1 | iMask2;

        return ((iNo&iMask)!=0);
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in) ;
        System.out.println("Enter the 1st number");
        int iValue1=0;
        iValue1=sobj.nextInt();

        System.out.println("Enter the 1st position");
        int iPos1=0;
        iValue1=sobj.nextInt();

        System.out.println("Enter the 2nd position");
        int iPos2=0;
        iValue1=sobj.nextInt();
        
       
        boolean iRet=CountOne(iValue1,iPos1,iPos2);
        if(iRet==true)
        {
            System.out.println("On");
        }

        else
        {
            System.out.println("Off");
        }



    }

}