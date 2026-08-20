import java.util.Scanner;

//non static method so we should create object
class StringX
{
    public int CountCapital(String str)    
    {
        char Arr[]=str.toCharArray();
        int iCnt=0;
        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i]>='A' && Arr[i]<='Z')
            {
                iCnt++;
            }
        }
    return iCnt;
    } 
    
    public int CountSmall(String str) 
    {
        int iCnt=0;
        char Arr[]=str.toCharArray();
       for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i]>='a' && Arr[i]<='z')
            {
                iCnt++;
            }
        }
    return iCnt;
    } 
    
    public int CountDigits(String str) 
    {
        int iCnt=0;
        char Arr[]=str.toCharArray();
       for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i]>='0' && Arr[i]<='9')
            {
                iCnt++;
            }
        }
    return iCnt;
    }  

    public int CountSpace(String str) 
    {
        int iCnt=0;
        char Arr[]=str.toCharArray();
       for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i]==' ')
            {
                iCnt++;
            }
        }
    return iCnt;
    }  

    public int CountSpecial(String str) 
    {
        int iCnt=0;
        char Arr[]=str.toCharArray();
       for(int i=0;i<Arr.length;i++)
        {
           if((Arr[i]>='!' && Arr[i]<='/')||
            (Arr[i]>=':' && Arr[i]<='@') ||
             (Arr[i]>='[' && Arr[i]<='`') ||
              (Arr[i]>='{' && Arr[i]<='~'))
            {
                iCnt++;
            }
        }
    return iCnt;
    }  
}    
public class program274
{
    public static void main(String[] args) 
    {
         Scanner sobj=new Scanner(System.in);
         String data=null;
         StringX strobj=new StringX();      
         System.out.println("Enter String:");
         data=sobj.nextLine();
         int iRet=0;
         iRet=strobj.CountCapital(data);
        System.out.println("Number of capital characters :"+iRet);

        iRet=strobj.CountSmall(data);
        System.out.println("Number of small characters :"+iRet);

        iRet=strobj.CountDigits(data);
        System.out.println("Number of digits are :"+iRet);

        iRet=strobj.CountSpace(data);
        System.out.println("Number of white spaces are :"+iRet);

         iRet=strobj.CountSpecial(data);
        System.out.println("Number of special symbols are :"+iRet);
       
    }
    
}

