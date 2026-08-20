
public class Program3
{
    static int i=5;

    public static void Display()     //4  //call 3
    {
        if(i>=1)
        {
           System.out.print(i);
            i--;

            Display();       //call 2 ,//call 4
           
        }
    }

    public static void main(String[] args)      //step 1
    {
        
        Display();        
        
    }
    
}
