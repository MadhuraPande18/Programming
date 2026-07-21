import java.util.Scanner;
public class ass6 
{

    public static boolean Checkeven(int iNo)
    {
        if(iNo%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        int iValue=0;
        boolean bRet=false;

        System.out.println("Enter Number:");
        iValue=sobj.nextInt();

        bRet=Checkeven(iValue);

        if(bRet==true)
        {
            System.out.println("Number is even");
        }

        else
        {
            System.out.println("number is odd");
        }
    }
    
}
