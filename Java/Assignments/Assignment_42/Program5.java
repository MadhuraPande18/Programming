import java.util.Scanner;

 class Display
{
    static char ch='a';
    public static void Display(int iNo)
    {
        if(iNo>=1)
        {
            System.out.print(ch);
            ch++;

            Display(iNo-1);
        }
    }
}

 public class Program5
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