
/**
 * Write a description of class ascending here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ascending
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int i,j,temp;
        System.out.println("Enter the numbers:");
        for(i = 0; i <= 4; i++){
            a[i]=sc.nextInt();
        }
        
        for(i = 0; i <= 4; i++){
            for(j = i+1; j <= 4; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.println("Ascending order:");
        for(i = 0; i <= 4; i++){
            System.out.println(a[i]);
        }
    }
}
