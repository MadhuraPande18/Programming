
public class Program1
{
    static int i=1;

    public static void Display()     //4  //call 3
    {
        if(i<=5)
        {
           System.out.print("*");
            i++;

            Display();       //call 2 ,//call 4
           
        }
    }

    public static void main(String[] args)      //step 1
    {
        
        Display();        
        
    }
    
}
