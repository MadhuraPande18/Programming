class Logic
{
    void CalculatePower(int base, int exp)
    {
        int power = 1;

        for(int i = 1; i <= exp; i++)
        {
            power = power * base;
        }

        System.out.println("Power = " + power);
    }
}

class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 4);
    }
}