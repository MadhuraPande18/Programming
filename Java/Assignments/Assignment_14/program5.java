import java.util.Scanner;

public class program5
{
    public static int CountNo(int[] arr,int iNo)
    {
        int iCnt=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i] == iNo)
            {
               iCnt++;
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
        System.out.println("enter wanted no");
        int iValue=sobj.nextInt();

        int result=CountNo(arr, n);
        System.out.println("Frequency of  number is:"+result);
    

        sobj.close();
    }
}