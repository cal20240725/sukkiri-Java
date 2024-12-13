package sukkiri.practice.practice_print10.practice01;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.showProfile();
		
		System.out.println("====================");
		
		Dog dog = new Dog("ポチ", "わんわん");
		
		dog.showProfile();
		
		System.out.println("====================");
		
		Cat cat = new Cat("タマ", "にゃーにゃー");
		
		cat.showProfile();
		
	}

}
