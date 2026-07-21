
import java.util.Scanner;

public class program2
 {
    public static void DisplayFactors(int iNo)
    {
        
        for(int i=iNo;i>=1;i--)
        {
            if(iNo%i==0)
            {
                System.out.println(i);
            }
        }
       
    }
    

    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number");
        iValue=sobj.nextInt();
        DisplayFactors(iValue);
        sobj.close();
    }

    
}
