class Logic
{
    void checkOdd(int num)
    {
        if(num % 2 != 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }
    }
}

public class program3
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.checkOdd(11);
    }
}