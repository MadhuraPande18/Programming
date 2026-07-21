import java.util.Scanner;

public class program3
{
    public static boolean Count_Diff(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==11)
           {
                return true;
           }
           
        }
        return false;        
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sobj.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sobj.nextInt();
        }

        boolean result=Count_Diff(arr);
        System.out.println(result);
    

        sobj.close();
    }
}