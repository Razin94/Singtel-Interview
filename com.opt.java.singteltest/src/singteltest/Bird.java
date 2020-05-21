package singteltest;

public class Bird implements Animal {
	@Override
	public void walk() {
		System.out.println("I am walking");
	}
	void fly() {
		System.out.println("I am flying");
	} 
	void sing() {
		System.out.println("I am Singing");
	}
}

class Duck extends Bird {
	void fly() {
		System.out.println("I am flying");
	}
	void sing() {
		System.out.println("Quack Quack");
	}
	void ownMove() {
		System.out.println("I can Swim");
	}
}

class Chicken extends Bird {
	void fly() {
		System.out.println("I cannot fly");
	}
	void sing() {
		System.out.println("Cluck Cluck");
	}
}

class Rooster extends Bird {
	//Implementing a model of Rooster with inheritance gives it a relationship to either Bird or Rooster
	//Creating the class on it's own is possible but it does not give a sense of the code not being done properly
	void fly() {
		System.out.println("I cannot fly");
	}
	void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
