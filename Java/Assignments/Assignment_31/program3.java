import java.util.Scanner;

class Difference
{
    public static void CountFr(String str)
    {
        int iCount=0;
        int jCount=0;
        for(int i=0;i<str.length();i++)
        {    
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                     iCount++;
                }

            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                jCount++;
            }
        }
         int Freq=iCount-jCount;
            System.out.println(Freq);
    }
}

public class program3 
{

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sobj.nextLine();
        Difference.CountFr(str);
    }
    
}
