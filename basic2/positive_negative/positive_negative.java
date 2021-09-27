
/**
 * Write a description of class positive_negative here.
 *
 * @author (Ayush)
 * @version (3/6/20-07)
 */
import java.util.Scanner;
public class positive_negative
{
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to know whether it is +ve or -ve:");
        a = s.nextInt();
        if(a>0){
            System.out.println("Your entered number is +ve.");
        }
        else if(a<0){
            System.out.println("Your entered number is -ve.");
        }
        else{
            System.out.println("Your entered number is 0.");
        }
    }
}
