//pattern printing

//input:5
//output:1 2 3 4 5

import java.util.*;


class program172
{

    public static void Display(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt+"\t");
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