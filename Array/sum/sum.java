
/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class sum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum=0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
            sum = sum+a[i];
        }
        
        System.out.println("The sum of all the Array elements is:"+sum);
    }
}
