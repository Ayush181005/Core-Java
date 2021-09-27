
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
        int a[] = new int[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}
