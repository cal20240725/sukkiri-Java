package sukkiri.lesson13.sample02;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;

	//その他メソッド
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	public void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		/* … */
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0 ) {
			this.die();
		}
	}
	
	//gettter
	public String getName() {
		return this.name;
	}
	
	//getter
	public int getHp() {
		return this.hp;
	}
	
	//getter
	public Sword getSword() {
		return this.sword;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	//setter
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	//setter
	public void setSword(Sword sword) {
		this.sword = sword;
	}

}
