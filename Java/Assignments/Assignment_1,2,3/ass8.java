import java.util.Scanner;

public class ass8
 {
    public static void main(String[] args) 
    {
        int iNo1=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        iNo1=sobj.nextInt();

        for(int i=1;i<=iNo1;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
       }

        sobj.close();
    }   
}
