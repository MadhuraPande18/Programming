import java.util.Scanner;

public class program4
{
    public static int Sum_NonFactors(int iNo)
    {   
        int sum=0;
        for(int i=1;i<=iNo;i++)
        {
            if((iNo%i) != 0)
            {
                sum=sum+i;
            }
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        int iValue;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        
        int iRet=Sum_NonFactors(iValue);

        System.out.println("output is:"+iRet);
        sobj.close();

        
    }
    
}
