import java.util.Scanner;

class Pattern
{
    public void Print(int iRow, int iCol)
    {
        int no = 1;

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(no + "\t");
                no++;
            }

            System.out.println();
        }
    }
}

public class program5
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int Outer=0;
        int Inner=0;
        System.out.println("Enter no of rows");
        Outer=sobj.nextInt();

         System.out.println("Enter no of columns");
         Inner=sobj.nextInt();

         Pattern pobj=new Pattern();
         pobj.Print(Outer, Inner);

         sobj.close();


        
    }

}
