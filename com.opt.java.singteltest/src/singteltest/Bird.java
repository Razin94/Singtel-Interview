package singteltest;

public interface Bird extends Animal {
	public String Walk = "I am walking";
	public String Fly = "I am flying";
	public String sing = "I am Singing";
	void fly(); 
	void sing();
}

class Duck implements Bird {
	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("Quack Quack");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
}

class Chicken implements Bird {

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

	@Override
	public void sing() {
		System.out.println("Cluck Cluck");
	}
	
}

class Rooster implements Bird {
	//Implementing a model of Rooster with inheritance gives it a relationship to either Bird or Rooster
		//Creating the class on it's own is possible but it does not give a sense of the code not being done properly
	
	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void fly() {
		System.out.println(" I cannot fly");
	}

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}