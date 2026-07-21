import java.util.Scanner;

public class program2
{
    public static boolean DisplayDigit(int iNo)
    {
        while(iNo!=0)
        {
            if(iNo<=0)
            {
                System.out.println(iNo=-iNo);
            }

            int Digit=iNo%10;  //2395==5
            if(Digit==0)
            {
                return true;
            }
            iNo=iNo/10;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int iValue1 = sc.nextInt();

        boolean bRet=DisplayDigit(iValue1);
        if(bRet==true)
        {
            System.out.println("It contains zero");
        }

        else
        {
            System.out.println("it does not contain any zero");
        }

    }
}
    
