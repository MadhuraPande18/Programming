class Logic
{
    void printTable(int num)
    {
        for(int i=1;i<=10;i++)
        {
            int table=1;
            table=num*i;
            System.out.println(table);
        }
    }
}

public class program5
{
    public static void main(String[] args) 
    {
        Logic lobj=new Logic();
        lobj.printTable(5);
        
    }
    
}
