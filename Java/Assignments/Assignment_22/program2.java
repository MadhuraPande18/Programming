import java.util.Scanner;

class Pattern
{
    public void Pattern(int iNo)
    {
        
        for(int i=iNo;i>=1;i--)
        {
           System.out.print(i+"*");
          
        }
    }
}

class program2
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number of elements:");
        iValue = sobj.nextInt();

        Pattern pobj=new Pattern();
        pobj.Pattern(iValue);
        
}
}