import java.util.Scanner;

class Program1
{
    public class SinglyLL
    {

    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        boolean bRet=false;
        int iValue=0;
        int iSize=0;

        SinglyLL sobj1=new SinglyLL();

        System.out.println("Enter the number of elements:");

        iSize = sobj1.nextInt();


        System.out.println("Enter the elements:");

        for(int i=1;i<=iSize;i++)
        {
            iValue=sobj1.nextInt();
            
        }

    }
}