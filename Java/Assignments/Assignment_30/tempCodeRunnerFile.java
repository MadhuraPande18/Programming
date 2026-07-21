import java.util.Scanner;

class CharacterX
{
    public void Display(char ch)
    {
        if(ch>='A' &&  ch<='Z')
        {
            ch = (char) (ch+32);
        }

        else if(ch>='a' && ch<='z')
        {
            ch = (char) (ch-32);
        }

    System.out.println("output:"+ch);

    }
}

public class program2
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