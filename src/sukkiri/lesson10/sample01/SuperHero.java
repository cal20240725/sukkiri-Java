package sukkiri.lesson10.sample01;

public class SuperHero extends Hero {
	//差分フィールド
	boolean flying;
	
	//差分メソッド
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

}
