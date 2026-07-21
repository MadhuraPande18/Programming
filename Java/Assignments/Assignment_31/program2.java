import java.util.Scanner;

public class program2 
{
    public static void CountSmall(String str)
    {
          int iCount=0;
        for(int i=0;i<str.length();i++)
        {    
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
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
        CountSmall(str);
    }
    
}
