import java.util.Scanner;

public class program3
{
    public static void Pattern(int iRow,int iCol)
    {
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                if(i==1 || i==iRow ||
                   j==1 || j==iCol ||
                   i+j==iCol+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows:");
        int iRow = sc.nextInt();

        System.out.println("Enter columns:");
        int iCol = sc.nextInt();

        Pattern(iRow,iCol);
    }
}