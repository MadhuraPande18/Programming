import java.util.Scanner;

public class program4
{   
    public static int OddFactorial(int iNo)
    {
        int fact = 1;

        for(int i = 1; i <= iNo; i++)
        {
            if(i % 2 != 0)
            {
                fact = fact * i;
            }
        }

        return fact;
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        int iRet = OddFactorial(iValue);

        System.out.println("odd Factorial is: " + iRet);

        sobj.close();
    }
}