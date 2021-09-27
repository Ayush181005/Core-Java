
/**
 * Write a description of class Methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Methods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str,str2;
        System.out.println("\nEnter a string in lower case to make it upper case:");
        str = sc.nextLine();
        System.out.println("The String in uppercase is : "+str.toUpperCase());
        
        System.out.println("\nEnter a string in upper case to make it lower case:");
        str = sc.nextLine();
        System.out.println("The String in lowercase is : "+str.toLowerCase());
        
        System.out.println("\nEnter a string to find out its length:");
        str = sc.nextLine();
        System.out.println("The length of the String is : "+str.length());
        
        System.out.println("\nEnter two strings to concate them:");
        str = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println("The string concate is : "+str.concat(str2));
        
        System.out.println("Enter a string including letter 'a' to replace all the letter 'a' with letter 'd'");
        str = sc.nextLine();
        System.out.println("The new word with letter 'd' on the place of letter 'a' is : "+str.replace('a','d'));
        
        System.out.println("Enter a string:");
        str = sc.nextLine();
        System.out.println("Enter the number of the letter(starting from 0) which you want to print:");
        int i = sc.nextInt();
        char result = str.charAt(i);
        System.out.println("The new word only with some letters is : "+result);
    }
}
