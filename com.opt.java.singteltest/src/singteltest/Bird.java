package singteltest;

public interface Bird extends Animal {
	public String Walk = "I am walking";
	public String Fly = "I am flying";
	public String sing = "I am Singing";
	String fly(); 
	String sing();
}

class Duck implements Bird {
	@Override
	public String walk() {
		String walk = "I am walking";
		return walk;
	}

	@Override
	public String fly() {
		String fly = "I am flying";
		return fly;
	}

	@Override
	public String sing() {
		String song = "Quack Quack";
		return song;
	}
	
	public String swim() {
		String swim = "I am swimming";
		return swim;
	}
}

class Chicken implements Bird {

	@Override
	public String walk() {
		System.out.println("I am walking");
		return null;
	}

	@Override
	public String fly() {
		System.out.println("I cannot fly");
		return null;
	}

	@Override
	public String sing() {
		System.out.println("Cluck Cluck");
		return null;
	}
	
}

class Rooster implements Bird {
	//Implementing a model of Rooster with inheritance gives it a relationship to either Bird or Rooster
		//Creating the class on it's own is possible but it does not give a sense of the code not being done properly
	
	@Override
	public String walk() {
		System.out.println("I am walking");
		return null;
	}

	@Override
	public String fly() {
		System.out.println(" I cannot fly");
		return null;
	}

	@Override
	public String sing() {
		System.out.println("Cock-a-doodle-doo");
		return null;
	}
}