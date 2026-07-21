import java.util.Scanner;
/*
  a
  a b
 a b c
a b c d 

*/

class Pattern
{
    public void Display(int iRow,int iCol)   //this is non static
    {
        int i=0; 
        int j=0;
        int iCount=0;
        char ch='\0';

        if(i != j)
        {
            System.out.println("Invalid");
            return;
        }

        for(i=1,ch='a';i<=iRow;i++,ch++)
        {
            for(j=1;j<=i;j++)
            
                    System.out.print(ch+"\t");
         }

            System.out.println();
        }
        
    }


public class program22
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
