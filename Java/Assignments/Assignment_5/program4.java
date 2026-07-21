
import java.util.Scanner;

public class program4
{   
    public static void pattern(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {   
            if((iNo%2) !=0)
            {
                System.out.println(iCnt);
            }

            else
            {
                System.out.println("its even");
            }
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
