import java.util.Scanner;

 class Display
{
    static int i=1;
    public static void Display(int iNo)
    {
        if(i<=iNo)
        {
            System.out.print("*");
            i++;

            Display(iNo);
        }
    }
}

 public class Program1
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