import java.util.Scanner;

public class program3 
{   
    public static int EvenFactorial(int iNo)
    {
        int fact = 1;

        for(int i = 1; i <= iNo; i++)
        {
            if(i % 2 == 0)
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

        int iRet = EvenFactorial(iValue);

        System.out.println("Even Factorial is: " + iRet);

        sobj.close();
    }
}