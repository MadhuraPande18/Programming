class Logic
{
    void findSmallestDigit(int num)
    {
        int Smallest = 0;

        while(num > 0)
        {
            int digit = num % 10;

            if(digit > Smallest)
            {
               Smallest = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest Digit = " + Smallest);
    }
}

class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(12345);
    }
}