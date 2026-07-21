import java.util.Scanner;
/*
    iRow=4;
    iCol=4;

    $ $ $ $
    $ $ $ $
    $ $ $ $
    $ $ $ $

 */
class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        for(int i=0;i<=iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(iRow==iCol)
                {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

public class program197 
{
    public static void main(String args[]) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue1=0,iValue2=0;
        System.out.println("Enter number of rows:");
        iValue1=sobj.nextInt();

        System.out.println("Enter number of columns");
        iValue2=sobj.nextInt();

        Pattern pobj=new Pattern();
        pobj.Display(iValue2, iValue2);
        
    }
    
}
