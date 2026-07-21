import java.util.Scanner;

public class program1
{
    public static int Difference(int[] arr)
    {
        int evenSum = 0;
        int oddSum = 0;

        for(int num : arr)
        {
            if(num % 2 == 0)
            {
                evenSum += num;
            }
            else
            {
                oddSum += num;
            }
        }

        return evenSum - oddSum;
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

        int result = Difference(arr);

        System.out.println("Difference = " + result);

        sobj.close();
    }
}