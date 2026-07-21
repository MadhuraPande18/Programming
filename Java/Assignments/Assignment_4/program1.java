import java.util.Scanner;

public class program1 
{
  
        public static int MultFact(int iNo)  //user defined function
        { 
            int product=1;      
            int iCnt=1;
            for(iCnt=1;iCnt<=iNo/2;iCnt++)
            {
                if(iNo%iCnt==0)
                {   
                    product=product*iCnt;
                }
            }

            return product;


        }
    
    public static void main(String[] args) 
    {       
        int iValue=1;
        int iRet;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        iRet=MultFact(iValue);

        System.out.println("Output is:"+iRet);

        sobj.close();
        
    }

    
}
