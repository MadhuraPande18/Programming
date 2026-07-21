import java.util.Scanner;

public class program3
{
    public static void Display(int[] arr)
    {
        for(int num : arr)
        {
            if(num%2==0 && num / 5 == 0)
            {
                System.out.println(num);
            }
        }
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

        Display(arr);

        sobj.close();
    }
}