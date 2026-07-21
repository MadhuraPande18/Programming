
import java.util.Scanner;

public class program3
{
    public static int ChkChar(String str,char cValue)
    
    {
        int iCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==cValue)
            {
               iCount++;
            }
        }
    return iCount;
   
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter name");
        String s=sobj.nextLine();

        System.out.println("enter character");
        char ch=sobj.next().charAt(0);
     
        
       int iRet=ChkChar(s, ch);
       System.out.println(iRet);
    }


    
}
