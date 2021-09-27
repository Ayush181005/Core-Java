class Human{
	//Overridden method
	public void eat() {
		System.out.println("Human is eating.");
	}
}

class Boy extends Human{
	//Overridden method
	public void eat() {
		System.out.println("Boy is eating.");
	}	
}

public class Method_Overloading_inheritence{
	public static void main(String[] args) {
		Boy obj = new Boy();
		//This will call the child class version of eat() i.e. Boy is eating.
		obj.eat();
	}
}