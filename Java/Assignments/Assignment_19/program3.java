class Logic
{
    void CheckDivisible(int num)
    {
       if(num%5==0 && num%11==0) 
       {
            System.out.println("is divisible");
       }

       else
       {
            System.out.println("not divisible");
       }
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.CheckDivisible(123);
    }
}