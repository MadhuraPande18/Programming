import java.util.Scanner;

public class program1 
{
    public static void Display(int iNo)
    {
         if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int i = 1; i <= iNo; i++)
        {
            System.out.print("*\t");
        }

        for(int i = 1; i <= iNo; i++)
        {
            System.out.print("#\t");
        }
    }
    

    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        iValue=sobj.nextInt();
        Display(iValue);
        sobj.close();
    }
}

    

