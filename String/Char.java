
/**
 * Write a description of class Char here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Char
{
    public static void main(String[] atgs)
    {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter a string to make it a character:");
        str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str);
        }
        System.out.println("String : "+str);
    }
}
