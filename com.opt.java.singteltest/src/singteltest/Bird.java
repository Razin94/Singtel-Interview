package singteltest;

public class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	} 
	void sing() {
		System.out.println("I am Singing");
	}
}

class Duck extends Animal {
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

class Chicken extends Animal {
	void fly() {
		System.out.println("I cannot fly");
	}
	void sing() {
		System.out.println("Cluck Cluck");
	}
}
