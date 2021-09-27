
public class Final_method {

	final int speedlimit = 90;  //final variable set, like const in C or C++
	
	void run() {
		speedlimit = 400; //Compile time error
	}
	public static void main(String[] args) {
		Final_method obj = new Final_method();
		obj.run();
	}

}
