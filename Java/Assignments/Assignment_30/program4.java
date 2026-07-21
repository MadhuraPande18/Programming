import java.util.Scanner;

class CharacterX
{
    public static  boolean chkSpecial(char ch)
    {
       if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
       {
            return false;
       }

       else
       {
            return true;
       }
    }
}
public class program4 
{
    public static void main(String[] args) 
    {
        char cValue='\0';
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the character");
        cValue=sobj.next().charAt(0);

        CharacterX cobj=new CharacterX();
        boolean bRet=cobj.chkSpecial(cValue);

        if(bRet==true)
        {
            System.out.println("Its special character");
        }

        else
        {
            System.out.println("its not a special character");
        }
                
    }   
}
