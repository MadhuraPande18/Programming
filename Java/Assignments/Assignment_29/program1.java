
import java.util.Scanner;

public class program1
{
     public static boolean ChkAlpha (char ch)
        {
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
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
        char ch= '\0';
        System.out.println("Enter the character:");
        ch=sobj.next().charAt(0);

        boolean bRet= ChkAlpha(ch);
        if(bRet==true)
        {
            System.out.println("This is character");
        }

        else
        {
            System.out.println("this is not character");
        }
        
    }    
}
