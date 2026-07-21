import java.util.Scanner;

class program1
{
    public static boolean ChkBit(int iVal)
{
    int iMask=0x00001000;
  
    if((iVal & iMask)==iMask)
    {
        return true;
    }

    else
    {
        return false;
    }
}
public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
        System.out.println("Enter the number");
        iNo=sobj.nextInt();
        
        
       boolean iRet=false;

       iRet=ChkBit(iNo);

       if(iRet==true)
       {
            System.out.println("it is true");
       }

       else
       {
        System.out.println("It is false");
       }
       

    
    }
}


    