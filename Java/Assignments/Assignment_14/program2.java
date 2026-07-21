import java.util.Scanner;

public class program2
{
    public static int Count_Diff(int[] arr)
    {
        int EvenCnt=0;
        int OddCnt=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i] % 2 == 0)
            {
               EvenCnt++;
            }

            else
            {
                OddCnt++;
            }
        }

        int difference=EvenCnt-OddCnt;
        return difference;
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

        int result=Count_Diff(arr);
        System.out.println("difference bw odd even number is:"+result);
    

        sobj.close();
    }
}