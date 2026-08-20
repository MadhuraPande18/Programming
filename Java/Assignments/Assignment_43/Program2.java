import java.util.Scanner;

class StringDemo
{
    static int Strlen(String str)
    {
        if(str.equals(""))
        {
            return 0;
        }

        return 1 + Strlen(str.substring(1));
    }
}

public class Program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sobj.nextLine();

        int iRet = StringDemo.Strlen(str);

        System.out.println("Length is : " + iRet);

        sobj.close();
    }
}