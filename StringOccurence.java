import java.util.Arrays;
import java.util.Scanner;

public class StringOccurence
{
    public static String sortString(String inputStr)            //Sorting the inputed string into ascending order
    {
        char buffer[] = inputStr.toCharArray();
        Arrays.sort(buffer);
        return new String(buffer);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the string:: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        String output = sortString(str);
        char buffer [] = output.toCharArray();
        int i = 0;
        int j;
        int counter = 0;
        while (i < buffer.length)                                   
        {
            char k = buffer[i];
            for (j = i; j < buffer.length; j++)
            {
                if (k == buffer[j])
                {
                    counter++;
                }
            }
            System.out.println("Number of occurence of " + k + " is " + counter + " times.");
            int m = counter;
            if (counter == 1)
            {
                i++;
            }
            else
            {
                i = i + m;
            }
            counter = 0;
        }
    }
}