
import java.util.Scanner;

class program4
{

    public static void convert(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>=48 && ch<=57)
            {
               System.out.print(ch);
            }
      
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter string:");
        String str1=sobj.nextLine();
        convert(str1);
        
    }
}