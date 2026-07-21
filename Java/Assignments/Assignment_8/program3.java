import java.util.Scanner;

public class program3
{
    public static double ConvertDistance(float dist)
    {
        return dist*1000;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometer= ");
        float value = sc.nextFloat();

        double result = ConvertDistance(value);

        System.out.println("Area of circle is: " + result);
    }
}