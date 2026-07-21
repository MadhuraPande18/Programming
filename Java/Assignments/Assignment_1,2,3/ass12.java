
import java.util.Scanner;

public class ass12
{
    public static void main(String[] args) 
    {
        int iNo=0;
        int sum=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        iNo=Sc.nextInt();

        //logic
        for(int i=1;i<iNo;i++)
        {
            if(iNo%i!=0 )
            {
                System.out.println(i);
                sum=sum+i;
            }


        }

        System.out.println("Sum of factors is:"+ sum);

        Sc.close();
    }
    
}
