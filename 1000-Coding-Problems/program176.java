//pattern printing
//input:7
//output:1* 3* 5 * 7 *
import  java.util.*;
class program176
{

    public static void Display(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.print("*\t");  //t==tab
            }

            else
            {
                System.out.print(iCnt+"\t");
            }
            
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