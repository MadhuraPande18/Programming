
import java.util.Scanner;

public class program1 
{
    public static boolean ChkChar(String str,char cValue)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==cValue)
            {
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter name");
        String s=sobj.nextLine();

        System.out.println("enter character");
        char ch=sobj.next().charAt(0);
     
        
        boolean bRet=ChkChar(s, ch);

        if(bRet==true)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }


    
}
