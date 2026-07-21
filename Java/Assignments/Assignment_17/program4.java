class Logic
{
    void findMax(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+"is maximum");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+"is maximum");
        }

        else
        {
            System.out.println(c+ "is max");
        }
    }
}

public class program4 
{
    public static void main(String[] args) 
    {
        Logic lobj=new Logic();
        lobj.findMax(20,125,44455);
        
    }
    
}
