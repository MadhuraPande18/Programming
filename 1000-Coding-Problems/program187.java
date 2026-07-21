import java.util.*;
//input=7
//output= A b C d E f G
//iCnt  = 1 2 3 4 5 6 7

class program187
{
    public static void Display(int iNo) 
    {
        int iCnt=0;
        char Ch = '\0';
        char ch='\0';
        
        for( iCnt = 1,Ch='A',ch='a'; iCnt <= iNo; iCnt++,Ch++, ch++) 
            {
                if(iCnt%2==0)   //even jaga
                {
                    System.out.print(ch+"\t");   
                }

                else        //odd jaga
                {
                    System.out.print(Ch+"\t");  
                }
                
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter the number of elements:");
        
        iValue = sobj.nextInt();
        Display(iValue);
    }
}
