//pattern printing

//input:4
//output:*1* *2* *3* *4* 
import  java.util.*;
class program175
{

    public static void Display(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*"+iCnt+"*\t");  //t==tab
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