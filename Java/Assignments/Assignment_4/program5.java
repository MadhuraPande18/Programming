import java.util.Scanner;

public class program5
{
    public static int FactDiff(int iNo)
    {   
        int Factsum=0;
        int NonFactSum=0;
        for(int i=1;i<iNo;i++)
        {
            if((iNo%i) == 0)
            {
               Factsum=Factsum+i;

            }

            else
            {
                NonFactSum=NonFactSum+i;
            }
        }

        return Factsum-NonFactSum;
        
    }

    public static void main(String[] args) 
    {
        int iValue;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        
        int iRet=FactDiff(iValue);

        System.out.println("output is:"+iRet);
        sobj.close();

        
    }
    
}
