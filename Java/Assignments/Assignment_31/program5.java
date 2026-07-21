import java.util.Scanner;

class Reverse
{
    public static void Rev(String str)
    {
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    
    }
}

public class program5
{

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sobj.nextLine();
        Reverse.Rev(str);
    }
    
}
