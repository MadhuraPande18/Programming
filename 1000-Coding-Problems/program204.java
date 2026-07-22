import java.util.Scanner;
/*
    iRow=4;
    iCol=4;
    a b c d
    a b c d
    a b c d
    
 */
class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        int i=0;
        int j=0;
        char ch='\0';

        for( i=1;i<=iRow;i++)
        {
            for(j=1,ch='a';j<=iCol;j++,ch++)
            {
                System.out.println(ch+'\t');
            }
         }

            System.out.println();
        }
    }


public class program204
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
