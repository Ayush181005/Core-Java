
/**
 * Write a description of class swap_3rd_variable here.
 *
 * @author (Ayush)
 * @version (3/6/20-06)
 */
import java.util.Scanner;
public class swap_3rd_variable
{
    public static void main(String[] args){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers for swapping them using a third variable:");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Previously, the first number is "+a+" and the second number is "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping them using third variable, the first one is "+a+" and the second one is "+b);
    }
}
