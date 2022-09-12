package HelloWorldExercise;

public class HelloWorld3
{
    public static void main (String [] args)
    {
        String txt ="Hello World";
        int count=0;

        //Counts each character except space
        for(int i=0;i<txt.length();i++)
        {
           if(txt.charAt(i)!= ' ')
               count++;
        }

        //Displays the total number of characters present in 'Hello World'
        System.out.println("Total number of characters in 'Hello World': " + count);

    }
}
