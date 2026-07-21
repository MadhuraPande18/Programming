class Logic
{
    int iSum = 0;

    void sumEvenNumbers(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                iSum = iSum + i;
            }
        }

        System.out.println("Sum = " + iSum);
    }
}

public class program1
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}