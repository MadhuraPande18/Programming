import java.util.Scanner;

class CharacterX
{
    public void Display(char ch)
    {
        if(ch>='A' &&  ch<='Z')
        {
            for(char c=ch;c<='Z';c++)
            {
                System.out.print(c+"\t");
            }
        }

        else if(ch>='a' && ch<='z')
        {
           for(char c=ch;c>='a';c--)
            {
                System.out.print(c+"\t");
            }
        }

    System.out.println();

    }
}

public class program3
{
    public static void main(String[]args)
    {
        Scanner sobj=new Scanner(System.in);
        char cValue='\0';
        CharacterX cobj=new CharacterX();
        System.out.println("Enter character:");
        cValue=sobj.next().charAt(0);

        cobj.Display(cValue);


        System.out.println();
    }
}