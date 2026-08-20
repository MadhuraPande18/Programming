import java.util.Scanner;

public class Program1 
{
    public static void main(String[] args) 
    {
    int distance=0;
    String Peak_hour;
    int Fare=0;
    float amount=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter distance in KM");
    distance=sc.nextInt();

    System.out.println("Enter Peak Hour(Yes/No");
    Peak_hour=sc.next();

    if(distance<0)
    {
        System.out.println("Invalid Input");
    }

    else if(distance<=10)
    {
        Fare=50+12*distance;
    }

    else 
    {
        int extra_dist=distance-10;
        Fare=50+10*12+extra_dist*15;

    }


    if(Peak_hour.equals("Yes"))
    {
        float Discount=(Fare*20.0f)/100;
        amount=Fare-Discount;
    }

    
        System.out.println("Fare: " + Fare);
        System.out.println("Final Amount: " + amount);


        

    }    
}
