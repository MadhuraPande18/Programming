import java.util.Scanner;

class StringX
{
    public String Update(String str)    
    {
        char Arr[]=str.toCharArray();
        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i] =='A' || Arr[i]=='a')
            {
                Arr[i]='_';
            }
        }
    String ret=new String(Arr);     //new updated string
    return ret;

    } 
    
  
   

}    
public class program278
{
    public static void main(String[] args) 
    {
         Scanner sobj=new Scanner(System.in);
         String data=null;
         StringX strobj=new StringX(); 
         String  
         System.out.println("Enter String:");
         data=sobj.nextLine();
        
    }
    
}

