import java.util.*;
//input=11
//output= * * * # # # * * *  #  #
//iCnt  = 1 2 3 4 5 6 7 8 9 10 11

//logic: 3-3 che grp

class program188
{
    public static void Display(int iNo) 
    {
        int iCnt=0;
        
        for( iCnt = 1, iCnt <= iNo; iCnt++) 
            {
                if(iCnt%2==0)   //even jaga
                {
                    System.out.print(ch+"\t");   
                }

                else        //odd jaga
                {
                    System.out.print();  
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
