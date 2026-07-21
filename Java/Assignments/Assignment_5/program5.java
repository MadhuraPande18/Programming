
import java.util.Scanner;

public class program5
{   
    public static void pattern(int iNo)
    {
        for(int iCnt=1;iCnt<=5;iCnt++)
        {
            System.out.println(iNo*iCnt);
        }
    }
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        iValue=sobj.nextInt();
        pattern(iValue);
        sobj.close();
    }
}
