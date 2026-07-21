class Logic
{
    void calculateProduct(int num)
    {
        int product = 1;

        while(num > 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of Digits = " + product);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateProduct(1234);
    }
}