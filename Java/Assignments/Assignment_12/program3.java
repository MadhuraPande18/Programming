import java.util.Scanner;

public class program3
{
    public static void DisplayFreq(int iNo)
    {
        int iCnt=0;
        while(iNo!=0)
        {
            int Digit=iNo%10;
            if(Digit==2)
            {   
                iCnt++;
            }
            iNo=iNo/10;
        }

        System.out.println(iCnt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int iValue1 = sc.nextInt();

        DisplayFreq(iValue1);

    }
}
    
