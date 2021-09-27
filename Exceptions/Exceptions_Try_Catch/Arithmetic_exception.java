import java.util.Scanner;

public class Arithmetic_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		System.out.println("Enter two numbers: ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		try {	//It will try doing this but if there will be any arithmetic exception(error*(for eg. no2 = 0), it will go to catch block for the indication of error
			ans = no1 / no2;
		}
		
		catch(ArithmeticException e){	//e is just an object to call the error
			e.printStackTrace();
		}
		
		System.out.println(no1+"/"+no2+"="+ans);
	}

}
