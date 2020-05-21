package singteltest;

public class Solution {
	public static void main(String[] args) {
		//References to point to the correct classes and methods
		Parrot refPWD = new ParrotWithDog();
		Parrot refPWC = new ParrotWithCat();
		
		System.out.println(Animal.walk);
		System.out.println(Bird.Fly);
		//Each reference is pointing to a different parrot
		System.out.println(refPWD.sing());
		System.out.println(refPWC.sing());
		}

}
