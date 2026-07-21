public class program1
 {  
     public static void display()
    {
      for(int i=0;i<=255;i++)
    {
        System.out.println(
            "Symbol:"+ (char)i + "\tDecimal:"+i+"/tOctal:"+
            Integer.toOctalString(i)+
            "\tHexadecimal:0X" +Integer.toHexString(i).toUpperCase()
        );

    }
      }
        
    
    public static void main(String[] args) 
    {

        display();     
    }
    
}
