package Exercise1;
import java.util.Scanner;


    public class Test
    {
        public static void main (String [] args)
        {

            Scanner input = new Scanner(System.in);
            String firstName,middleName,lastName,color;

            int age;

            System.out.println("What is your first name?");
            firstName = input.nextLine();

            System.out.println("What is your middle name?");
            middleName = input.nextLine();

            System.out.println("What is your last name?");
            lastName = input.nextLine();

            System.out.println("What is your favorite color?");
            color = input.nextLine();

            System.out.println("How old are you?");
            age = input.nextInt();



            String fullName = firstName + " " + middleName + " " + lastName;

            System.out.println("A story about " + fullName + " :");

            String fullNameCaps = fullName.toUpperCase();
            char firstInitial = firstName.charAt(0);
            char middleInitial = middleName.charAt(0);
            char lastInitial = lastName.charAt(0);


            System.out.println("\t" + fullNameCaps + " is " + firstInitial + middleInitial + lastInitial);
            System.out.println("\t" + firstInitial + middleInitial + lastInitial + "'s favorite color is " + color + ", and " + firstName + " age is " + age);
        }
    }
