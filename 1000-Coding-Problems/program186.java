import java.util.*;
//input=7
//output= A 2 C 4 E 6 G 

class program186 {
    public static void Display(int iNo) 
    {
        int iCnt=0;
        char ch = '\0';
        
        for( iCnt = 1,ch='A'; iCnt <= iNo; iCnt++, ch++) 
            {
                if(iCnt%2==0)
                {
                    System.out.print(iCnt);
                }

                else
                {
                    System.out.print(ch );  // print with space
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
