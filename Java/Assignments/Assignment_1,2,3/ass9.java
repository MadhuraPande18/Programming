import java.util.Scanner;

public class ass9 
{
    public static void main(String[] args) 
    {
      int iNo1=0;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter number");
      iNo1=sc.nextInt(); 
      
      for(int i=1;i<=iNo1;i++)
      {
        if(iNo1%i==0 && i%2==0)
            {
                System.out.println(i);
            }
      }

      sc.close();
    }
}
    

    


    

