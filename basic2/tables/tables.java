
/**
 * Write a description of class tables here.
 *
 * @author (Ayush)
 * @version (3/6/20-11)
 */
import java.util.Scanner;
public class tables
{
    public static void main(String[] args){
        int a,i;
        System.out.println("Enter any number to get its table till 20:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for(i=1;i<=20;i++){
            System.out.printf("%d*%d=%d\n",a,i,a*i); 
        }
    }
}
