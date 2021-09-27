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

class BabyDog extends Animal{
	void weep(){
		System.out.println("Weeping...");
	}
}

public class Basics{
	public static void main(String[] args){
		BabyDog bd = new BabyDog();
		Dog d = new Dog();
		bd.weep();
		bd.eat();
		d.bark();
		d.eat();
	}
}