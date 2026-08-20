import java.util.Scanner;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'A' || Arr[i] == 'a')
            {
                Arr[i] = '-';
            }
        }

        return new String(Arr);
    }
}

public class program279
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;
        String sRet = null;

        StringX strobj = new StringX();

        System.out.println("Enter String:");
        data = sobj.nextLine();

        sRet = strobj.Update(data);

        System.out.println("Updated String is : " + sRet);
    }
}