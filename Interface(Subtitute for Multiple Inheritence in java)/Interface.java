/*
 * JAVA DOES NOT SUPPORT MULTIPLE INHERITENCE
 * TO USE THE PROPERTIES OF MULTIPLE INHERITENCE, INTERFACE METHOD IS USED
 * FOR EXAMPLE, IN THIS PROGRAM :-
 * THIS IS THE MULTIPLE INHERITENCE TYPE OF
 *    AnimalEat(Interface)    AnimalTravel(Interface)
 *            |_________________________|
 *                         |
 *                   Animal(Class)
 */

interface AnimalEat{	//It acts as a class
	void eat();
}

interface AnimalTravel{	//It acts a class
	void travel();
}

class Animal implements AnimalEat, AnimalTravel{	//implements is used to inherit interface
	public void eat() {	//Calling of void method from AnimalEat
		System.out.println("Animal is eating...");
	}
	
	public void travel() {	//Calling of void method from AnimalTravel
		System.out.println("Animal is travelling...");
	}
}

public class Interface {

	public static void main(String[] args) {
		Animal a = new Animal();	//Calling of class Animal which is implementing two interfaces
		a.eat();
		a.travel();
	}

}
