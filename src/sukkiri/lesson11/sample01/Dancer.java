package sukkiri.lesson11.sample01;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

}
