import java.util.Scanner;

public class program2
{
    public static void RangeDisplayEven(int iStart,int iEnd)  //2357
    {
        if(iStart>iEnd)
        {
            System.out.println("invalid range");
            return;
        }
       while(iStart<=iEnd )
       {
            if(iStart%2==0)
            {
                System.out.println(iStart+" ");
    
            }
            iStart++;
            
       }
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int iValue1 = sc.nextInt();
        
        System.out.println("enter ending number");
        int iValue2=sc.nextInt();

        RangeDisplayEven(iValue1, iValue2);

    }
}
    

