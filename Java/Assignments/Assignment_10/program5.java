import java.util.Scanner;

public class program5
{
    public static void RangeSumEven(int iStart,int iEnd)  //2357
    {
        if(iStart>iEnd)
        {
            System.out.println("invalid range");
            return;
        }
       while(iStart<=iEnd )
       {
            System.out.println(iEnd);

            iEnd--;
       }
    
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int iValue1 = sc.nextInt();
        
        System.out.println("enter ending number");
        int iValue2=sc.nextInt();

        RangeSumEven(iValue1, iValue2);

    }
}
    

