import java.util.Scanner;

public class program1 
{
    public static void CountCapital(String str)
    {
          int iCount=0;
        for(int i=0;i<str.length();i++)
        {    
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                     iCount++;
                }
        }
        System.out.println(iCount);

    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sobj.nextLine();
        CountCapital(str);
    }
    
}
