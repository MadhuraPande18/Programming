import java.util.Scanner;

public class NumberLine
{
    public static void main(String[] args)
    {
        int iNo = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sc.nextInt();

        // Part 1 - print 4,3,2,1
        for(int i = iNo; i >= 1; i--)
        {
            System.out.print(i + ", ");
        }

        // Part 2 - print -1,-2,-3,-4,-5
        for(int i = 1; i <= iNo+1; i++)
        {
            System.out.print(-i + ", ");
        }

        // Part 3 - print last value -4
        System.out.print(-iNo);

        sc.close();
    }
}