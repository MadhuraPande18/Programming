import java.util.Scanner;

class Pattern
{
    public void Pattern(int iNo)
    {
        char ch='A';
        for(int i=0;i<=iNo;i++)
        {
            System.out.println(ch);
            ch++;
        }
    }
}

class program1
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