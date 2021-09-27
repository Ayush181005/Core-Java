
/**
 * Write a description of class add here.
 * @author Ayush Singh
 * @version (2/6/20-04)
 */
import java.util.Scanner;
public class add
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers to be added:");
        int a;
        int b;
        int c;
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println(a+"+"+b+"="+c);
    }
}
