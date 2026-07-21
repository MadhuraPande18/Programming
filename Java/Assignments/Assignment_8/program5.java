import java.util.Scanner;

public class program5{
    
    public static double ConvertArea(float area)
    {
        return area*0.0929;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area: ");
        float value = sc.nextFloat();

        double result = ConvertArea(value);

        System.out.println(" Area is:" + result);
    }
}