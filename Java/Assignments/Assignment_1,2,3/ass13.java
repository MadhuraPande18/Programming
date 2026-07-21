
import java.util.Scanner;

public class ass13 
{
    public static void main(String[] args) 
    {
        int iNo=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        iNo=Sc.nextInt();

        //logic
        for(int i=1;i<iNo;i++)
        {
            if(iNo%i!=0 )
            {
                System.out.println(i);
            }

        }

        Sc.close();
    }
    
}
