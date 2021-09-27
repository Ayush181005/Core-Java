
/**
 * Write a description of class matrixe_sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class matrices_sum
{
   public static void main(String[] args){
       int i,j;
       int a[][] = new int[3][3];
       int b[][] = new int[3][3];
       int c[][] = new int[3][3];
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the 9 elements of first array a[i][j]:-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    a[i][j] = scan.nextInt();
                }
            }
            
       System.out.println("Enter the 9 elements of second array b[i][j]:-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    b[i][j] = scan.nextInt();
                }
            }
            
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
       System.out.println();
            
       System.out.println("a[i][j] :-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.printf(a[i][j]+"  ");
                }
                System.out.printf("\n");
            }
       System.out.println();
            
       System.out.println("b[i][j] :-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.printf(b[i][j]+"  ");
                }
                System.out.printf("\n");
            }
       System.out.println();
            
       System.out.println("c[i][j] :-");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.printf(c[i][j]+"  ");
                }
                System.out.printf("\n");
            }
    }
}
