import java.util.Scanner;

class StringX
{
    public String toUpperX(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i]=Arr[i]-32;       //error
        }

        return new String(Arr);
    }
}

public class program281
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;
        String sRet = null;

        StringX strobj = new StringX();

        System.out.println("Enter String:");
        data = sobj.nextLine();

        sRet = strobj.toUpperX(data);

        System.out.println("Updated String is : " + sRet);
    }
}