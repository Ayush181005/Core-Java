class DisplayOverloading {
	
	public void disp(char c) {
		System.out.println(c);
	}
	
	public void disp(char c, int num) {
		System.out.println(c+" "+num);
	}
	
}
public class Method_Overloading {

	public static void main(String[] args) {
		
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);
		
	}

}
