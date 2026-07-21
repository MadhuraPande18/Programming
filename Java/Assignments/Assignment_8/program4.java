import java.util.Scanner;

public class program4
{
    
    public static double ConvertTemp(float temp)
    {
        return (temp-32)*(5./9);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temp in fahrenheit: ");
        float value = sc.nextFloat();

        double result = ConvertTemp(value);

        System.out.println(" temperature in celcius is:" + result);
    }
}