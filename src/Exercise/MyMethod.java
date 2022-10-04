package Exercise;
import java.util.Scanner;

public class MyMethod
{
    static String student_name;
    static int count = 0, student_age, birth_year;
    static int current_year = 2022;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        student_name = input.nextLine();
        student(student_name);

        System.out.print("Please enter year of birth: ");
        birth_year = input.nextInt();
        age(birth_year);

        System.out.println("Total characters: " + count);
        System.out.println("Age: " + student_age);
    }
    static void student(String student_name)
    {
        for (int i = 0; i < student_name.length(); i++)
        {
            if (student_name.charAt(i) != ' ')
            {
                count++;
            }
        }
        if (count < 5)
        {   //display the output if the condition is true and the condition will stop
            System.out.println("Please enter your name at least 5 characters long.");
            System.exit(0);
        }
    }
    static void age(int birth_year)
    {
        student_age= current_year - birth_year;

        if (birth_year > current_year)
        {
            //display the output if the condition is true and the condition will stop
            System.out.print("Year of birth is greater than 2021. Please re-enter again.");
            System.exit(0);
        }
    }
}
