class Logic
{
    void checkPalindrome(int num)
    {
        int original=num;
        int iDigit=0,iRev=0;
       
        while(num>0)
        {
            iDigit=num%10;
            iRev=iRev*10+iDigit;
            num=num/10;
        }

        if(original==iRev)
        {
            System.out.println("Is palindrome");
        }

        else
        {
            System.out.println("Is not palindrome");
        }


    }
}

public class program2 
{
    public static void main(String[] args) 
    {
        Logic obj=new Logic();
        obj.checkPalindrome(121);
        
    }
}
