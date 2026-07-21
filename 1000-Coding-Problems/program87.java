import java.util.Scanner;

class DigitX
{
    public int CountOddDigits(int iNo)
    {
        int iDigit=0;
        int iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit!=0)
            {
                iCount++;
            }
            iNo=iNo/10;

        }

        return iCount;
    }
}
public class program87
 {
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;
        int iRet=0;

        System.out.println("The count number:");
        System.out.println("Enter the number");

        iValue=sobj.nextInt();

        iRet=dobj.CountOddDigits(iValue);
        System.out.println(iRet);

        iRet=dobj.CountOddDigits(iValue);



       
    }

    
}
