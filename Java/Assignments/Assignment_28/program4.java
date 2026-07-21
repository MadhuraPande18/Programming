import java.util.Scanner;

public class program4
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                // Border and Reverse Diagonal
                if(i == 1 || i == iRow ||
                   j == 1 || j == iCol ||
                   i + j == iCol + 1)
                {
                    System.out.print("*\t");
                }
                // Left side of Reverse Diagonal
                else if(i + j < iCol + 1)
                {
                    System.out.print("#\t");
                }
                // Right side of Reverse Diagonal
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int iRow = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int iCol = sc.nextInt();

        Pattern(iRow, iCol);

        sc.close();
    }
}