
public class Program5
{
    static char ch='a';

    public static void Display()     //4  //call 3
    {
        if(ch<='f')
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
