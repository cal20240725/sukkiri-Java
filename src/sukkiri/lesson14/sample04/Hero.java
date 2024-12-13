package sukkiri.lesson14.sample04;

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

}
