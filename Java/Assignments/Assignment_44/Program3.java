import java.util.Scanner;

public class Program3
{
    
    static int iCnt=0;
    public static int CountWhite(String str,int index)
    {
        
        if(str.length()!=index)
        {
            if((str.charAt(index))>='a' && (str.charAt(index)<='z'))
            {
                iCnt++;
            }

            CountWhite(str, index+1);
        }

        return iCnt;
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