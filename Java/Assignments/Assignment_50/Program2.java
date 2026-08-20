import java.util.Scanner;

public class Program2 
{
    public static void main(String[] args) 
    {
        
        float Marks=0;
        float Attendence=0;
        int income=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Marks");
    Marks=sc.nextInt();

    System.out.println("Enter Attendence Percentage:");
    Attendence=sc.nextInt();

    System.out.println("Enter Family income:");
    income=sc.nextInt();

  if((Marks < 0 || Marks > 100) || 
           (Attendence < 0 || Attendence > 100) || 
           income < 0)
    {
        System.out.println("Not applicable");
    }
    
    else
    {
        if((Marks>=80)&&(Attendence>=75)&&(income<=300000))
        {
            System.out.println("Scholership approved");
        }

        else
        {
            System.out.println("Sclolership not approved");
        }
    }




   
        

    }
    


        
    }
    
