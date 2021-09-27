
/**
 * Write a description of class CountWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CountWords
{
    public static void main(String[] args){
        int count=0;
        String str;
        int n=0;
        
        System.out.println("Enter the String to find out the number of words in it:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        System.out.println("Your entered String is :");
        System.out.println(str);
        
        String str2[] = str.split(" ");//    Method to  to split the string from space words
        
        for(int i = 0; i < str.length(); i++){
            n = str2.length;
        }
        System.out.println("The number of words are : "+n);
    }
}
