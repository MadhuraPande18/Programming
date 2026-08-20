import java.util.Scanner;

public class Program1
{
    public static void main(String[]args)
    {
        int hours=0;
        int Penulty=0;
        int Extra_hour=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Total parking hours:");
        hours=sobj.nextInt();

        if(hours<=2)
        {
            Penulty=20;
        }

        else if(hours<10)
        {
            Extra_hour=hours-2;
            Penulty=Extra_hour*10 +20;

        }

        else
        {
            Extra_hour=hours;
            Penulty=50+20+(8)*10;
        }

        System.out.println("Total Parking hours are:"+hours);
        System.out.println("Total extra hours are:"+Extra_hour);
        System.out.println("Total penulty"+Penulty);
    }

}