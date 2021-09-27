
/**
 * Write a description of class max_3 here.
 *
 * @author (Ayush)
 * @version (3/6/20-08)
 */
import java.util.Scanner;
public class max_3
{
    public static void main(String[] args){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three different numbers to find out the largest number:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the greatest number among the three numbers.");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest number among the three numbers.");
        }
        else if(c>a && c>b){
            System.out.println(c+" is the greatest number among the three numbers.");
        }
    }
}
