
import java.util.Scanner;


public class Program5
{
    public static void main(String[] args) 
    {
        int Amount=0;
        double Payable_amt=0.0;
        String Membership="\0";
        double DiscountAmt=0;
        double ExtraDiscount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount:");
        Amount=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter membership type-->Premium or Regular");
        Membership=sc.nextLine();

        if(Amount<=0)
        {
            System.out.println("Invalid");
        }

        else if(!(Membership.equals("Premium") )||(Membership.equals("Regular")))
        {
            System.out.println("Membership must be valid");
        }

        else
        {
            if(Amount>5000)

            {
            DiscountAmt=(Amount*20)/100;
           }

            else if(Amount>2000)
            {
                DiscountAmt=(Amount*10)/100;
            }

            else
            {
                DiscountAmt=0;
            }

            Payable_amt=Amount-DiscountAmt;

            if(Membership.equals("Premium"))
            {
                ExtraDiscount=(Payable_amt*5)/100;
                DiscountAmt=DiscountAmt-ExtraDiscount;
                Payable_amt=Payable_amt-ExtraDiscount;
            }

        System.out.println("Original amount:"+Amount);
        System.out.println("Total discount"+DiscountAmt);
        System.out.println("Final Payable amt:"+Payable_amt);

        }
    
    }

}