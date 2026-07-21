class Logic
{
    void countEvenOdd(int n)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Even Numbers = " + evenCount);
        System.out.println("Odd Numbers = " + oddCount);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOdd(10);
    }
}