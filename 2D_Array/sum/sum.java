
/**
 * Write a description of class col_sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class sum
{
    public static void main(String[] args){
        int i,j;
        int a[][] = new int[3][3],sum=0;
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter 9 numbers to find its sum and form a table:-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    a[i][j] = scan.nextInt();                    
                }
            }  
            
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.printf(a[i][j]+"  ");
                    sum=sum+a[i][j];
                }
                System.out.printf("\n");
            }
            System.out.println("The sum of all the elements is :"+sum);
    }
}
