
import java.util.Scanner;

public class ass10 
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sobj.next().charAt(0);

        if(Character.isUpperCase(ch))
        {
            System.out.println(Character.toLowerCase(ch));
        }

        else
        {
            System.out.println(Character.toUpperCase(ch));
        }

        sobj.close();
        
    }
    
}
