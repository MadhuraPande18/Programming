import java.util.Scanner;

class Pattern
{
    public void Print(int iRow,int iCol)
    {

        for(int i=iRow;i>=1;i--)
        {

            for(int j=iCol;j>=1;j--)
            {
                System.out.print(i);
            }

           

            System.out.println();
        }


    }
}

public class program4
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
