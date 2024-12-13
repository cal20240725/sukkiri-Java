package sukkiri.lesson12.sample05;

public abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	public abstract void attack(Monster m);

}
