import java.util.Scanner;

public class program2
{
    public static void ReturnOddCount(int iNo)  //2357
    {
        int iCnt=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }

        while(iNo!=0)  //till iNo becomes 0
        {   
            int idigit=0;
            idigit=iNo%10;  //2357%10=7
            if(idigit%2!=0) 
            {
                iCnt++;
            }

            //iCnt=0;

            iNo=iNo/10;   //235
        }

        System.out.println(iCnt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();
        ReturnOddCount(value);

    }
}
    

