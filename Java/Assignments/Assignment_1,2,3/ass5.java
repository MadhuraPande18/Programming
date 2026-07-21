
import java.util.Scanner;

public class ass5 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int no=0;
        System.out.println("Enter first number");
        no=sobj.nextInt();

        int freq=0;
       System.out.println("Enter second number");
        freq=sobj.nextInt();

      for(int i=1;i<=freq;i++)
      {
        System.out.println(no+" ");
      }

      sobj.close();

        
    }
    
}
