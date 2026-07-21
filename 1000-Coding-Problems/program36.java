
import java.util.Scanner;

public class program36 
{
    public static void main(String[] args) 
    {
        //scanner class
        Scanner sobj=new Scanner(System.in);
        //buffered and non buffered are two methods for input

        String sName=null;
        int iAge=0;
        float fMarks=0.0f;

        System.out.println("Enter your name");
        sName=sobj.nextLine();

        System.out.println("Enter your age");
        iAge=sobj.nextInt();

        System.out.println("Enter your marks");
        fMarks=sobj.nextFloat();

        System.out.println("Name:"+sName);
        System.out.println("Age:"+iAge);
        System.out.println("Marks:"+fMarks);

        
    }
    
}
