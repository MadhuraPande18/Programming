import java.util.Scanner;

public class program3
{
    public static int Factorial(int iNo)
    {
        int iFact = 1;

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        int iRet = Factorial(iValue);

        System.out.println("Factorial is : " + iRet);

        sobj.close();
    }
}