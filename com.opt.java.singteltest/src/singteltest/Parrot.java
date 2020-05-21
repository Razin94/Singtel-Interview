package singteltest;

public interface Parrot extends Bird{
	String livingEffect();
	String livingLocation();
}

class ParrotWithDog implements Parrot{

	@Override
	public String fly() {
		String fly = "I am flying";
		return fly;
	}

	@Override
	public String sing() {
		String song;
		if (livingEffect() != null) {
			song = "Woof Woof";
		} else {
			song = "Tweet tweet";
		}
		return song;
	}

	@Override
	public String move() {
		String walk = "I am walking";
		return walk;
	}

	@Override
	public String livingEffect() {
		String livingWithDog = "I stay with a dog";
		return livingWithDog;
	}

	@Override
	public String livingLocation() {
		String neighbour = "I live in a house with dogs";
		return neighbour;
	}
	
}

class ParrotWithCat implements Parrot{

	@Override
	public String fly() {
		String fly = "I am flying";
		return fly;
	}

	@Override
	public String sing() {
		String song;
		if (livingEffect() != null) {
			song = "Meow";
		} else {
			song = "Tweet tweet";
		}
		return song;
	}

	@Override
	public String move() {
		String walk = "I am walking";
		return walk;
	}

	@Override
	public String livingEffect() {
		String livingWithCat = "I stay with a dog";
		return livingWithCat;
	}

	@Override
	public String livingLocation() {
		String neighbour = "I live in a house with cats";
		return neighbour;
	}
	
}

class ParrotWithRooster implements Parrot{

	@Override
	public String fly() {
		String fly = "I am flying";
		return fly;
	}

	@Override
	public String sing() {
		String song;
		if (livingEffect() != null) {
			song = "Cock-a-doodle-doo";
		} else {
			song = "Tweet tweet";
		}
		return song;
	}

	@Override
	public String move() {
		String walk = "I am walking";
		return walk;
	}

	@Override
	public String livingEffect() {
		String livingWithCat = "I stay near a rooster";
		return livingWithCat;
	}

	@Override
	public String livingLocation() {
		String neighbour = "I live next to a farm with roosters";
		return neighbour;
	}
	
}