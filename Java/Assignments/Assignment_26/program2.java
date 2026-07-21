import java.util.Scanner;

public class program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int iRow = sc.nextInt();

        System.out.print("Enter Columns : ");
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