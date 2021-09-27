
/**
 * Write a description of class basic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class basic
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        String str;
        str = sc.nextLine();
        
        System.out.println("String entered by you is : "+str);
    }
}
