//count common on bits
import java.util.Scanner;

class program3
{
    public static boolean  CountOne(int iNo)
    {
        int iMask1=0X100;
        int iMask2=0X800;
        int iMask=iMask1 | iMask2;

        if((iMask & iNo)!=0)
        {
            return  true;
        }
    return  false;
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in) ;
        System.out.println("Enter the 1st number");
        int iValue1=0;
        iValue1=sobj.nextInt();

        
       
        boolean iRet=CountOne(iValue1);
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