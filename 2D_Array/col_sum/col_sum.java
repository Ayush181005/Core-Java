
/**
 * Write a description of class col_sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class col_sum
{
    public static void main(String[] args){
        int i,j;
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter 9 values for finding column wise sum of ther tabular form:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (i = 0; i < 3; i++) {
            int cSum = 0;
            for (j = 0; j < 3; j++) {
                cSum += arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum = " + cSum);
        }
    }
}
