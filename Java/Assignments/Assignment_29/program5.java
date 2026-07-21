
import java.util.Scanner;

public class program5
{
     public static void DisplaySchedule(char chDiv)
     {
        chDiv=Character.toUpperCase(chDiv);

        switch (chDiv) 
        {
            case 'A':
                System.out.println("Your exam at 7:00 AM");
                 break;

            case 'B':
                System.out.println("your exam at 8:30 AM ");
                break;
            
            case 'C':
                System.out.println("your exam at 9:30 AM ");
                break;
            
            case 'D':
                System.out.println("your exam at 10:30 AM ");
                break;

            default:
                System.out.println("invalid syntax");
        }

     }
        
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        char ch= '\0';
        System.out.println("Enter the division:");
        ch=sobj.next().charAt(0);
        DisplaySchedule(ch);
       
        
    }    
}
