
import java.util.Scanner;

public class program5
 {

    public static void display(char ch)
    {
        int Ascii=(int)ch;
        System.out.println("Decimal:"+Ascii);
        System.out.println("Octal:"+Integer.toOctalString(Ascii));
        System.out.println("Hexadecimal:0X"+Integer.toHexString(Ascii).toUpperCase());
    }
    
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter character:");
        char cValue=sobj.next().charAt(0);

        display(cValue);
        
        
    }
    
}
