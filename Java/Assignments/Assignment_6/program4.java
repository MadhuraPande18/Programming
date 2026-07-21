import java.util.Scanner;

public class program4
{
    public static int table(int iNo)
    {
        int num = 1;

        for(int iCnt =1; iCnt <=10 ; iCnt++)
        {
          System.out.println(iNo*iCnt);
        }

        return iNo;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        int iRet = table(iValue);

        System.out.println("table is : " + iRet);

        sobj.close();
    }
}