
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//4. Accept a file name and create the file if it does not exist

public class Program4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter filename:");

        String FileName=sc.nextLine();

        File file=new File(FileName);

        try
        {
            if(file.createNewFile())
            {
                System.out.println("File created successfully");

            }

            else
            {
                System.out.println("File already exists");
            }
        }

        catch(IOException e)

        {
            System.out.println("Error creating file");
        }

        sc.close();
    }
    
}
