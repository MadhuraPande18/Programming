import java.util.Scanner;

 class Display
{
    public static void Display(int iNo)
    {
        if(iNo>=1)
        {
            System.out.print(iNo);
            iNo--;

            Display(iNo);
        }
    }
}

 public class Program3
{
    public static void main(String[] args) 
    {
         int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        
        Display.Display(iValue);
    }
}