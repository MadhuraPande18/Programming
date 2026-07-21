import java.util.Scanner;

public class program2
{
    public static double calculateArea(float width,float height)
    {
        return width*height;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter =width: ");
        float value1 = sc.nextFloat();

         System.out.print("Enter =height: ");
        float value2 = sc.nextFloat();


        double area = calculateArea(value1,value2);

        System.out.println("Area of rec is: " +area);
    }
}