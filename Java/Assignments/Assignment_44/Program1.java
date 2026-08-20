import java.util.Scanner;

public class Program1
{
     static int iCount=0;
    public static int CountWhite(String str,int index)
    {
      
        
        if(str.length()==index)
        {
            return 0;
        }

        if(str.charAt(index) == ' ')
        {
           iCount++;
           CountWhite(str, index+1);
        }

        else
        {
            CountWhite(str, index+1);
        }

        return iCount;
 
    }

    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sobj.nextLine();
        int iRet=CountWhite(str, 0);
        System.out.println(iRet);
    }

}