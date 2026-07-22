import java.util.Scanner;
/*
    iRow=4;
    iCol=4;
    a b c d
    1 2 3 4
    a b c d
    1 2 3 4
    
 */
class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        int i=0;
        int j=0;
        char Ch='\0';

        for( i=1;i<=iRow;i++)
        {
            for(j=1,Ch='a';j<=iCol;j++,Ch++)
            {
                if(i%2==0)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(Ch+'\t');
                }
                
            }
         }

            System.out.println();
        }
    }


public class program206
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
