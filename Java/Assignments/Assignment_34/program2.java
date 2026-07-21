
import java.util.Scanner;

class program2
{
    public static String StrCopy(String str,int iCnt)
    {
        String temp="";
        
        for(int i=0;i<=iCnt && i<str.length();i++)
        {
           temp=temp+str.charAt(i);
        }
        
        return temp;

    }

    public static void main(String[] args) 
    {
         Scanner sobj=new Scanner(System.in);
        System.out.println("enter:");
        String sValue=sobj.nextLine();

        int iValue=0;
        System.out.println("enter size:");
        iValue=sobj.nextInt();
        StrCopy(sValue,iValue);

        String CopyXString=StrCopy(sValue,iValue);
        System.out.println("copied string is:"+CopyXString);

        
    }
}