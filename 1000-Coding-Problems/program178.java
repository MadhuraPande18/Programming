//pattern printing
//input:7
//output:1* 2* 3 * 4 

//its not correct
import java.util.*;
class program178
{
    public static void Display(int iNo)
    {
        int iCnt=0;
        
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iNo%2==0)       //even
            {
                System.out.print("*");
            }

            else
            {
                System.out.println(((iCnt/2)+1)+"\t");
            }

           System.out.println();
            
        }

        System.out.println();  
    }
    public static void main(String[] args) 
    {   
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("Enter the number of elements:");
        
        iValue=sobj.nextInt();
        Display(iValue);        
    }
}