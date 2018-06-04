import java.util.Scanner;

public class StringCapitalize
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string:: ");
        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine();
        char buffer[] = strInput.toCharArray();
        int i;
        for (i = 0; i < buffer.length; i++)
        {
            if (buffer[i] >= 'A' && buffer[i] <= 'z')
            {
                if (i % 2 != 0 && (buffer[i] >= 'a' && buffer[i] <= 'z'))
                {
                    buffer[i] = (char)(buffer[i] - 32);
                }
                if (i % 2 == 0 && (buffer[i] >= 'A' && buffer[i] <= 'Z'))
                {
                    buffer[i] = (char)(buffer[i] + 32);
                }
            }

        }
        String strOutput = new String(buffer);
        System.out.println("The required string is " + strOutput);
    }
}