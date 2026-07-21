import java.util.Scanner;

public class program4
{
    public static int Count11(int[] arr)
    {
        int iCnt=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i] == 11)
            {
               iCnt++;  //freq
            }
        }
        return iCnt;
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

        int result=Count11(arr);
        System.out.println("Frequency of 11 number is:"+result);
    

        sobj.close();
    }
}