
import java.util.Scanner;

public class ass7 
{
    public static void main(String[] args) 
    {
        int iNo1=0;
        Scanner Sobj=new Scanner(System.in);
        System.out.println("Enter number");
        iNo1=Sobj.nextInt();

        for(int i=0;i<iNo1;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        Sobj.close();

        
    }
    
}
