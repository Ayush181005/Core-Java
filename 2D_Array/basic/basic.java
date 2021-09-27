
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
            int row=3,col=3,i,j;
            int a[][] = new int[3][3];            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 9 numbers to form a table:-");
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    a[i][j] = scan.nextInt();
                }
            }
            
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    System.out.printf(a[i][j]+"  ");
                }
                System.out.printf("\n");
            }
    }
}
