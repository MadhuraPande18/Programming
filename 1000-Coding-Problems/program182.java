import java.util.*;

class program182 {
    public static void Display(int iNo) {
        char ch = '/0';
        
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
