
/**
 * Write a description of class pattern here.
 *
 * @author Ayush Singh
 * @author (Ayush)
 * @version (3/6/20-01)
 */
import java.util.Scanner;
public class pattern
{
    public static void main(String[] args){
        int row,i,j;
        System.out.println("Enter the number of rows to make pattern:");
        Scanner s = new Scanner(System.in);
        row = s.nextInt();
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d",i);
            }
            System.out.printf("\n");
        }
    }
}
