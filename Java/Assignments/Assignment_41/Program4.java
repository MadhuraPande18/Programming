
public class Program4
{
    static char ch='A';

    public static void Display()     //4  //call 3
    {
        if(ch<='F')
        {
           System.out.print(ch+" ");
            ch++;

            Display();       //call 2 ,//call 4
           
        }
    }

    public static void main(String[] args)      //step 1
    {
        
        Display();        
        
    }
    
}
