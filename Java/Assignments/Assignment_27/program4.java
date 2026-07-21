import java.util.Scanner;

public class program4
{
    public static void Pattern(int iRow,int iCol)
    {
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                if(i==1 || i==iRow || j==1 || j==iCol || i==j)
                {
                    System.out.print("#\t");
                }

                else
                {
                    System.out.print("\t");
                }

               
            }
        System.out.println();

        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int iValue1=0;

        System.out.println("Enter no.of rows");
          iValue1=sc.nextInt();

        int iValue2=0;
        System.out.println("enter no of columns");
        iValue2=sc.nextInt();
        

        Pattern(iValue2, iValue2);
        

        
    }
}