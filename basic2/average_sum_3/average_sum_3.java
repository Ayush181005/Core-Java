
/**
 * Write a description of class average_sum_3 here.
 *
 * @author (Ayush)
 * @version (3/6/20-05)
 */
import java.util.Scanner;

public class average_sum_3
{
    public static void main(String[] args){
        int a,b,c,d,choice;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the choice:");
        System.out.println("1.Average of three numbers");
        System.out.println("2.Sum of three numbers");
        choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter three numbers for taking average of them:");
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();
                d = (a+b+c)/3;
                System.out.println("The average of "+a+", "+b+" and "+c+" is "+d);
                break;
                
            case 2:
                System.out.println("Enter three numbers for adding them:");
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();
                d = a+b+c;
                System.out.println(a+"+"+b+"+"+c+"="+d);
                break;
                
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
