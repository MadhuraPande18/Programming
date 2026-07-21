import java.util.*;
//input=11
//output=   * * * *
        //  * * * *
        //  * * * *
           
class program190
{
    public static void Display() 
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=4;iCnt++) //--->for \n
        {
            System.out.print("*\t");
        }

        System.out.println(); //for new line

        for(iCnt=1;iCnt<=4;iCnt++)      //--->for \n
        {
            System.out.print("*\t");
        }

        System.out.println(); //for new line
        for(iCnt=1;iCnt<=4;iCnt++)      //--->for \n
        {
            System.out.print("*\t");
        }

        System.out.println(); //for new line


    }


    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        //System.out.println("Enter the number of elements:");
        
        //iValue = sobj.nextInt();
        Display();
    }
}
