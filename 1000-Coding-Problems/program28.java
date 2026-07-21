import java.util.Scanner;

class StringX
{
    public String toUpperX(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }

        return new String(Arr);
    }
}

public class program28
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
        
        sRet = strobj.toggle(data);

        System.out.println("Updated String is : " + sRet);
    }
}