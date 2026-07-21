class Logic
{
    void displayGrade(int marks)
    {
        if(marks < 0 || marks > 100)
        {
            System.out.println("Invalid Marks");
        }
        else if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade B");
        }
        else
        {
            System.out.println("Grade C");
        }
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.displayGrade(95);   // Grade A
        obj.displayGrade(75);   // Grade B
        obj.displayGrade(40);   // Grade C
        obj.displayGrade(2024); // Invalid Marks
    }
}