class Logic
{
    int evenSum = 0;
    int oddSum = 0;

    void Sum_oddEven(int num)
    {
        while(num > 0)
        {
            int digit = num % 10;

            if(digit % 2 == 0)
            {
                evenSum = evenSum + digit;
            }
            else
            {
                oddSum = oddSum + digit;
            }

            num = num / 10;
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}

public class program4
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.Sum_oddEven(121);
    }
}