import java.util.Scanner;
/*
    iRow=4;
    iCol=4;

    $ $ $ $
    # # # # 
    $ $ $ $
     # # # #
 */
class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        char Arr[]={'#','*'};
        int j=0;

        for(int i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                System.out.print(Arr[i%2]+"\t");
            }

              System.out.println();
        }
    }
}

public class program202
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
