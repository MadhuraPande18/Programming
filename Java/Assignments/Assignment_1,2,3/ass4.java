import java.util.Scanner;

public class ass4 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int num=0;
        System.out.println("Enter Number");
        
        num=sobj.nextInt();

        if(num<10)
        {
            System.out.println("Hello");
        }

        else
        {
            System.out.println("Demo");
        }

        
    }
    
}
