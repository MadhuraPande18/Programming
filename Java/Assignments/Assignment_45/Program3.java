import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Program3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.println("Enter data to append");
        String Data=sc.next();

        try
        {
            FileWriter writer = new FileWriter(fileName, true);

            writer.write(Data);
            writer.write("\n");

            writer.close();

            System.out.println("Data appended successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error while writing.");
        }

        sc.close();
    }
}