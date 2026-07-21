import java.util.Scanner;

class Logic
    {
        void SumOfDigits(int num)
        {
           int iSum=0;
            while(num>0)
            {
                iSum=iSum+num%10;
                num=num/10;

            }

            System.out.println("Sum of digits:"+iSum);
        }
    }

    class program1
    {
        public static void main(String[] args) 
        {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter the number");
            int iValue=0;
            iValue=sobj.nextInt();
            Logic obj=new Logic();
            obj.SumOfDigits(iValue);
            
        }
    }
    

