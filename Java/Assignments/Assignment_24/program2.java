import java.util.Scanner;

class Pattern
{
    public void Print(int iRow,int iCol)
    {
        char ch= '\0';
        char Ch='\0';

        for(int i=1;i<=iRow;i++)
        {
               Ch='A';
               ch='a';


            for(int j=1;j<=iCol;j++)
            {
            
                if(i%2==0)
                    {
                        System.out.print(ch);
                        ch++;
                    } 
                else
                    {
                        System.out.print(Ch);
                        Ch++;
                    }           
            }

            System.out.println();
        }


    }
}

public class program2
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
