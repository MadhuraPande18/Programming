
import java.util.Scanner;

class program4
{
    public static String StrCopy(String str)
    {
        String temp="";
        
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
              
                 temp=temp+str.charAt(i);
            }
          
        }
        
        return temp;

    }

    public static void main(String[] args) 
    {
         Scanner sobj=new Scanner(System.in);
        System.out.println("enter:");
        String sValue=sobj.nextLine();

       
        String CopyXString=StrCopy(sValue);
        System.out.println("copied string is:"+CopyXString);

        
    }
}