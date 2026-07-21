//count common on bits
import java.util.Scanner;

class program2
{
    public static void  CountOne(int iNo1,int iN02)
    {
        int iCount=0;
        int iNo=iNo1&iN02;
        int iPos=1;
        while(iNo!=0)
        {
            if((iNo&1)==1)
            {
               System.out.println(iPos);
            }
        iNo=iNo>>1;
        iPos++;

        }

    }
    
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in) ;
        System.out.println("Enter the 1st number");
        int iValue1=0;
        iValue1=sobj.nextInt();

        System.out.println("Enter the 2nd number");
        int iValue2=0;
        iValue2=sobj.nextInt();
       
        CountOne(iValue1, iValue2);



    }

}