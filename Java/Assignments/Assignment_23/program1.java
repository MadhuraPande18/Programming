import java.util.Scanner;

class Pattern
{
    public void PrintStars(int iRow,int iCol)
    {
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

public class program1
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
         pobj.PrintStars(Outer, Inner);

         sobj.close();


        
    }

}
