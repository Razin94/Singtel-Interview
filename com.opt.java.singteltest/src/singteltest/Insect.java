package singteltest;

public interface Insect extends Animal {
	String sound();
	boolean soundCheck();
}

class Butterfly implements Insect {

	@Override
	public String move() {
		String move = "I am flying";
		return move;
	}

	@Override
	public String sound() {
		Butterfly refB = new Butterfly();
		String sound;
		if (refB.soundCheck()) {
			sound = "Nothing";
		} else {
			sound = "Present";
		}
		return sound;
	}

	@Override
	public boolean soundCheck() {
		return false;
	}
	
}