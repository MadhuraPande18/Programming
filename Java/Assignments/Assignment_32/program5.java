import java.util.Scanner;
class program5
{
      public static void convert(String str)
    {
        int iCnt=0;
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)==' ')
           {
                iCnt++;
           }
      
        }
 System.out.println(iCnt);
 
    }
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter string:");
        String str1=sobj.nextLine();
        convert(str1);
        
    }
}