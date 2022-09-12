package HelloWorldExercise;

public class HelloWorld4
{
    public static void main (String [] args)
    {
        String txt="Hello World";
        int count=0;
        char word;

        for(int i=0;i<txt.length();i++)
        {
            word=txt.charAt(i);
            if(word=='l')

                count++;

        }

        System.out.println("Frequency of l is : "+count);
    }
}
