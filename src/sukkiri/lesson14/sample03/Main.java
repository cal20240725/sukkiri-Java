package sukkiri.lesson14.sample03;

public class Main {
	public static void main(String[] args) {
		//①toString()の呼び出し
		Hero h1 = new Hero();		
		h1.name = "ミナト";
		h1.hp = 100;
		
		System.out.println(h1.toString());
		
		//③equals()の呼び出し
		Hero h2 = new Hero();		
		h2.name = "ミナト";
		h2.hp = 100;
		
//		Hero h3 = new Hero();		
//		h3.name = "アサカ";
//		h3.hp = 100;
		
//		h2 = h1;
		
		System.out.println("h1:" + h1);
		System.out.println("h2:" + h2);
//		System.out.println("h3:" + h3);
		
		if(h1.equals(h2) == true) { // == trueはなくてもいい
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
//		
//		if(h1.equals(h3) == true) { // == trueはなくてもいい
//			System.out.println("同じ内容です");
//		} else {
//			System.out.println("違う内容です");
//		}
		
		if(h1 == h2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
