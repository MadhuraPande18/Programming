import java.util.*;

class program183 {
    public static void Display(int iNo) 
    {
        int iCnt=0;
        char ch = '\0';
        
        for( iCnt = 1,ch='a'; iCnt <= iNo; iCnt++, ch++) 
            {
            System.out.print(ch + "\t ");  // print with space
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
