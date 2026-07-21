//pattern printing
import java.util.*;


class program171
{

    public static void Display(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*\t");
        }

        System.out.println();   //for nextline after input
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