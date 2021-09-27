 
/**
 * Write a description of class calculator here.
 *
 * @author (Ayush)
 * @version (4/6/20-12)
 */
import java.util.Scanner;
public class calculator
{
    public static void main(String[] args){
        int a,b,c,choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.exit");
        choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter two numbers to be added:");
                a = s.nextInt();
                b = s.nextInt();
                c=a+b;
                System.out.println(a+"+"+b+"="+c);
                break;
                
            case 2:
                System.out.println("Enter two numbers to be Subtracted(first-second):");
                a = s.nextInt();
                b = s.nextInt();
                c=a-b;
                System.out.println(a+"-"+b+"="+c);
                break;
                
            case 3:
                System.out.println("Enter two numbers to be multiplied:");
                a = s.nextInt();
                b = s.nextInt();
                c=a*b;
                System.out.println(a+"*"+b+"="+c);
                break;
                
            case 4:
                System.out.println("Enter two numbers to be Divided(first/second):");
                a = s.nextInt();
                b = s.nextInt();
                c=a/b;
                System.out.println(a+"/"+b+"="+c);
                break;
                
            case 5:
                System.exit(1);
                
            default:
                System.out.println("\t\t\tInvalid choice!!!");
        }
    }
}
