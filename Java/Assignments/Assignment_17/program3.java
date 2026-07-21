class Logic
{
    void findMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+"is maximum");
        }
        else
        {
            System.out.println(b+"is maximum");
        }
    }
}

public class program3 
{
    public static void main(String[] args) 
    {
        Logic lobj=new Logic();
        lobj.findMax(20,125);
        
    }
    
}
