class Animal{
	void eat(){
		System.out.println("Eating...");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Barking...");
	}
}

public class Basics{
	public static void main(String[] args){
		Dog d = new Dog();                 //Syntax of calling tha class
		d.bark();
		d.eat();
	}
}