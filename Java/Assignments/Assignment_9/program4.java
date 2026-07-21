import java.util.Scanner;

public class program4
{
    public static void mult_digits(int iNo)  //2357
    {
        int iCnt=0;
         int mult=1;

        if(iNo<0)
        {
            iNo=-iNo;
        }

        while(iNo!=0)  //till iNo becomes 0
        {   

            int idigit=iNo%10;  //2357%10=7
            mult=idigit*mult;   //7*1-->7*5    
            iNo=iNo/10;    //235      
        }


        System.out.println(mult);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();
        mult_digits(value);
    }
}
    

