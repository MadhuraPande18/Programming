
import java.util.Scanner;

public class ass14 
{
    public static void main(String[] args) 
    {
        int iNo=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        iNo=sc.nextInt();

        for(int i=1;i<=iNo;i++)
        {
            System.out.print("$ * ");
        }
        sc.close();
    }
    
}
