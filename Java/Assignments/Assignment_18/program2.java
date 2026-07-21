class Logic
{
    void checkEven(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }
    }
}

public class program2
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.checkEven(11);
    }
}