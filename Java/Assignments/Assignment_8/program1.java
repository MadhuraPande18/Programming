import java.util.Scanner;

public class program1
{
    public static double calculateArea(float radius)
    {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float value = sc.nextFloat();

        double result = calculateArea(value);

        System.out.println("Area of circle is: " + result);
    }
}