import java.util.*;

class program181 {
    public static void Display(int iNo) {
        char ch = 'a';   // start from lowercase 'a'

        for(int iCnt = 1; iCnt <= iNo; iCnt++, ch++) {
            System.out.print(ch + " ");  // print with space
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
