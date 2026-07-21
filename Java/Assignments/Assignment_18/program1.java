class Logic 
{
    void checkPrime(int num) 
    {
        if(num%num==0 && num%1==0)
        {
            System.out.println("Number is prime");
        }

        else
        {
            System.out.println("not prime");
        }

    }
}
public class program1 
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
        
    }
}
