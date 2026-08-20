
import java.io.File;
import java.util.Scanner;


public class Program5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter directory name");
        String dirName=sc.nextLine();

        File dir=new File(dirName);

        if(dir.exists()&&dir.isDirectory())
        {
            String Files[]=dir.list();
            System.out.println("Files in directory");

            for(String file:Files)
            {
                System.out.println(file);
                 }
        }
        else
        {
            System.out.println("Invalid directory.");
        }

        sc.close();
    }
}