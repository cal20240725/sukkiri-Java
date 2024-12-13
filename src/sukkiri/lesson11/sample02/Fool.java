package sukkiri.lesson11.sample02;

public class Fool extends Character implements Human {
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わずに遊んでいる");
	}
	
	//さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {
		System.out.println(this.name + "は戦わずに話している");
	}
	
	public void watch() {
		System.out.println(this.name + "は戦わずに見ている");
	}
	
	public void hear() {
		System.out.println(this.name + "は戦わずに聞いている");
	}
	
	public void run() {
		System.out.println(this.name + "は戦わずに逃げ出した");
	}

}
