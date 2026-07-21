class Logic
{
    int iValue = 0;

    void PrintDigits(int num)
    {
        while(num > 0)
        {
            iValue = num % 10;
            System.out.println(iValue);
            num = num / 10;
        }
    }
}

class Program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDigits(123445);
    }
}