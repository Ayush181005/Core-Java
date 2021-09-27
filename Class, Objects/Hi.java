class Hello{
	void HelloWorld(){
		System.out.println("Hello World!!!");
	}
}

public class Hi{
	public static void main(String[] args){
		Hello obj = new Hello();           //Syntax of calling a class
		obj.HelloWorld();
	}
}