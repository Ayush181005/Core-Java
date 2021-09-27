import java.io.IOException;
import java.util.Scanner;

public class Exceptions_Throw_Throws_etc {
	
	public static void Age(int age) throws IOException{	//NOTE:Throws will look that inside it the error can or cannot be there - it is not sure about it
		if(age < 18) {
			throw new IOException("Not valid age!!!");	//Throw actually makes an error
		}
		else {
			System.out.println("Ok!!!You can enter!!!");
		}
	}

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		try {
			Age(age);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("After exception!!!");
	}

}
