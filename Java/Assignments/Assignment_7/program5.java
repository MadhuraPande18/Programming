import java.util.Scanner;

public class program5
{   
    public static int DiffFactorial(int iNo)
    {
        int Oddfact = 1;
        int EvenFact=1;

        for(int i = 1; i <= iNo; i++)
        {
            if(i % 2 != 0)
            {
                Oddfact = Oddfact * i;
            }

            else
            {           
                EvenFact=EvenFact*i;
            }
        }

        int DiffFact=Oddfact-EvenFact;
        return DiffFact;
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        int iRet = DiffFactorial(iValue);

        System.out.println("diff fact is"+ iRet);

        sobj.close();
    }
}