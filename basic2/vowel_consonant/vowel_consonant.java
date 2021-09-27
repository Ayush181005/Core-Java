
/**
 * Write a description of class vowel_consonant_switchcase here.
 *
 * @author Ayush Singh
 * @version (3/6/20-01)
 */
import java.util.Scanner;
public class vowel_consonant
{
    public static void main(String[] args){
        System.out.println("Enter a letter to check whether it is a vowel or consonant(Enter in small letters):");
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("The entered integer is an vowel.");
        }
        else{
            System.out.println("Given character is a consonant.");
        }
    }
}
