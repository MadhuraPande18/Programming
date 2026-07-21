import java.util.Scanner;

public class program1 
{
    public static void DisplayDigit(int iNo)
    {
        while(iNo!=0)
        {
            int Digit=iNo%10;
            System.out.println(Digit+"");
            iNo=iNo/10;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int iValue1 = sc.nextInt();

        DisplayDigit(iValue1);

    }
}
    
