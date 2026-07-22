import java.util.Scanner;
/*
    iRow=4;
    iCol=4;
    
    % % % % % % 
    %         %
    %         %
    %         %
    %         %
    % % % % % %  

    
    
 */
class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        int i=0;
        int j=0;
        int iCount=0;

        if(i != j)
        {
            System.out.println("Invalid");
            return;
        }

        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j==1 || j==iCol || i==iRow || i==1 ||i==j)  
                {
                    System.out.print("%\t");
                }

                else
                {
                    System.out.print( "\t");
                }
            }

            System.out.println();
        }
        
    }
}


public class program217
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
