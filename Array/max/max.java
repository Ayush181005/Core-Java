
/**
 * Write a description of class max here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class max
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int max=a[3];
        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
            if(max < a[i]){
                max = a[i];
            }
        }
        
        System.out.println("The maximum out of all the array elements is:"+max);
    }
}
