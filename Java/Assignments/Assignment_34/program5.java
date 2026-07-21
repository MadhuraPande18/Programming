
import java.util.Scanner;

class program5
{
    public static String StrCopy(String str,String str2)
    {
        String temp="";
        temp=str+str2;
        return temp;

    }
    

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter:");
        String sValue=sobj.nextLine();

        
      
        System.out.println("enter 2:");
        String sValue2=sobj.nextLine();

        String Str=StrCopy(sValue, sValue2);
        System.out.println(Str);
        

        
    }
}