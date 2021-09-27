package Package1;
import Package2.Hello2;	//Here we include void method from other packages, we can put 'Package2.*;' to import all main methods

public class Hello {

	public static void main(String[] args) {
		System.out.println("Package 1");
		
		Hello2 obj = new Hello2();	//Here we declare object obj from Hello2
		obj.Two();
	}

}
