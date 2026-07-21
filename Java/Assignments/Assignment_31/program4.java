import java.util.Scanner;

public class program4 
{
    public  boolean ChkVowel(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
                ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
             {
                return true;
             }

             else
             {
                return false;
             }
        }
    return false;
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter string:");
        String sValue=sobj.nextLine();

        program4 pobj=new program4();
        boolean bRet = pobj.ChkVowel(sValue); // Call function

        if(bRet == true)
      {
    System.out.println("String contains vowel");
            }
    else
    {
    System.out.println("String does not contain vowel");
    }

        
    }
    
}
