
/**
 * Write a description of class copy_contents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class copy_contents
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.println("b["+i+"]="+b[i]);
        }
    }
}
