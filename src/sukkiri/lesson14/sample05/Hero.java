package sukkiri.lesson14.sample05;

public class Hero {
	String name;
	int hp;
	static int money;

	//②toString()のオーバーライド
	public String toString() {
		return "名前：" + this.name + "/HP：" + this.hp;
	}

	//④equals()のオーバーライド
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}

		if(o instanceof Hero h) {
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	//①staticメソッドを用意、staticメソッドにアクセス
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		//②staticメソッドからインスタンス変数にアクセス(エラーになる)
		System.out.println(this.name + "たちの所持金を初期化しました");
	}

}
