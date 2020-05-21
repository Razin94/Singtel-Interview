package singteltest;

public interface Fish extends Animal{
	//B.1.a
	String swim = "I can swim";
	//B.1.b
	String noWalk = "I cannot walk";
	//B.1.c
	String noSing = "I cannot Swim";
	
	String swim();
	String shape();
	String colour();
	String uniqueAttribute();
}

class Shark implements Fish {

	@Override
	public String move() {
		String move = "I cannot walk";
		return move;
	}

	@Override
	public String swim() {
		String swim = "I am swimming";
		return swim;
	}

	@Override
	public String shape() {
		String shape = "Large";
		return shape;
	}

	@Override
	public String colour() {
		String colour = "Grey";
		return colour;
	}
	
	@Override
	public String uniqueAttribute() {
		String special = "Eat other Fish";
		return special;
	}
}

class Clownfish implements Fish {

	@Override
	public String move() {
		String move = "I cannot walk";
		return move;
	}

	@Override
	public String swim() {
		String swim = "I am swimming";
		return swim;
	}

	@Override
	public String shape() {
		String shape = "small";
		return shape;
	}

	@Override
	public String colour() {
		String colour = "orange";
		return colour;
	}

	@Override
	public String uniqueAttribute() {
		String special = "I make jokes";
		return special;
	}
}

class Dolphin implements Animal {
	//This class models a dolphin
	//it is an animal but not a fish so it inherits only from animal
	@Override
	public String move() {
		String move = "I am swimming";
		return move;
	}
	
}