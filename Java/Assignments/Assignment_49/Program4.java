import java.util.Scanner;

public class Program4
{
    public static void main(String[] args) 
    {
        String helmet;
        String licence;
        String OverSpeading;
        int totalFine=0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Helmet Worn?:");
        helmet = sobj.next();

        System.out.println("Licence available?:");
        licence = sobj.next();

        System.out.println("OverSpeading?:");
        OverSpeading = sobj.next();

    if (!(helmet.equals("Yes") || helmet.equals("No")) 
    || !(licence.equals("Yes") || licence.equals("No")) 
    || !(OverSpeading.equals("Yes") || OverSpeading.equals("No")))
    {
    System.out.println("Inputs must be Yes/No");
    }

    else
    {

    if(helmet.equals("No"))
    {
        totalFine=totalFine+50;
    }

    if(licence.equals("No"))
    {
        totalFine=totalFine+1000;
    }

     if(OverSpeading.equals("Yes"))
    {
        totalFine=totalFine+1500;
    }

    System.out.println("total fine amount is:"+totalFine);

    }

    sobj.close();
}
    
}
