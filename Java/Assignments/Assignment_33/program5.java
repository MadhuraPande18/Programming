
import java.util.Scanner;

public class program5
{
    public static void ChkChar(String str)
    
    {
        int iCount=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    
   
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter name");
        String s=sobj.nextLine();

        
       ChkChar(s);

    }


    
}
