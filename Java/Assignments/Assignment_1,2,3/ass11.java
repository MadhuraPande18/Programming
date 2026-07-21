import java.util.Scanner;

public class ass11 
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        ch = sc.next().charAt(0);

        char lower = Character.toLowerCase(ch);
        if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        sc.close();
    }
      
    }

