import java.util.Scanner;

public class ass3 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
        System.out.println("Print Number:");
        iNo=sobj.nextInt();
        for(int i=1;i<=iNo;i++)
        {
            System.out.println("*");
        }

        sobj.close();


    }
    
}
