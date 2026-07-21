import java.util.Scanner;

public class program1
{
    public static void RangeDisplay(int iStart,int iEnd)  //2357
    {
        if(iStart>iEnd)
        {
            System.out.println("invalid range");
        }
       while(iStart<iEnd)
       {
            System.out.println(iStart);
            iStart++;
       }

       System.out.println(iStart);
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int iValue1 = sc.nextInt();
        
        System.out.println("enter ending number");
        int iValue2=sc.nextInt();

        RangeDisplay(iValue1, iValue2);

    }
}
    

