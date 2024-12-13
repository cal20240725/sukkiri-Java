package sukkiri.lesson12.sample04;

public class Main {
	public static void main(String[] args) {
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		
//		Thief t1 = new Thief();
//		
//		Wizard w1 = new Wizard();
//		Wizard w2 = new Wizard();
//		
//		//冒険開始！
//		//まず宿屋に泊まる
//		
//		h1.hp += 50;
//		h2.hp += 50;
//		t1.hp += 50;
//		w1.hp += 50;
//		w2.hp += 50;
//		
//		System.out.println(h1.hp);
//		System.out.println(h2.hp);
//		System.out.println(t1.hp);
//		System.out.println(w1.hp);
//		System.out.println(w2.hp);
		
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Hero();
		c[3] = new Hero();
		c[4] = new Hero();
		
		//宿屋に泊まる
		
		for(Character ch : c) {
			ch.hp += 50;
		}
		
		for(Character ch : c) {
			System.out.println(ch.hp);
		}
		
	}

}
