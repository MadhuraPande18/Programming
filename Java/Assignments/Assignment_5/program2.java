
import java.util.Scanner;

public class program2
{   
    public static  void pattern(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {

            System.out.println(iCnt);
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
