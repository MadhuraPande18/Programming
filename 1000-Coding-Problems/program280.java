class program280
{


public class StringX
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
}