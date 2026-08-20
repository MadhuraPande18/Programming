import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) 
    {
        int[]Marks=new int[5];
        Scanner sobj=new Scanner(System.in);
        int i=0;
        int iSum=0;
        int Average=0;
        boolean bFail=false;
       
        for( i=0;i<5;i++)
        {
            System.out.println("Enter Marks of subject"+(i+1)+":");
            Marks[i]=sobj.nextInt();

        while(Marks[i] < 0 || Marks[i] > 100)
            {
                System.out.println("Marks must be in between 0 to 100");
                System.out.println("Enter marks again:");
                Marks[i] = sobj.nextInt();
            }
    
        if(Marks[i]<35)
        {
            bFail=true;
        }

        iSum=iSum+Marks[i];
    }

    if(bFail)
    {
        System.out.println("Result:Fail");
    }

    else
    {
        Average=iSum/5;
        if(Average>=75)
        {
            System.out.println("Final Result: Distinction");
        }

        else if(Average>=60)
        {
            System.out.println("First class");
        }

        else if(Average>=50)
        {
            System.out.println("Second class");
        }

        else
        {
            System.out.println("Pass");
        }
    }

    sobj.close();

    }
}