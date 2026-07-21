import java.util.Scanner;

public class program1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int iRow = sc.nextInt();
        int iCol = sc.nextInt();

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j <= (iCol - i + 1))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}