package sukkiri.lesson14.sample03;

public class Hero {
	String name;
	int hp;
	
//	//②toString()のオーバーライド
//	public String toString() {
//		return "名前：" + this.name + "/HP：" + this.hp;
//	}
	
	//④equals()のオーバーライド
	public boolean equals(Object o) { //oはmainメソッドのh2のこと
		System.out.println("o:" + o);
		if(this == o) { //thisはh1のこと
			return true;
		}
		
		System.out.println("a");
		
		if(o instanceof Hero h) {
			System.out.println("b");
			if(this.name.equals(h.name)) { //hはh2のこと
				System.out.println("c");
				return true;
			}
		}
		System.out.println("d");
		return false;
	}

}
