package sukkiri.lesson14.sample02;

public class Main {
	public static void main(String[] args) {
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		
		System.out.println(o1); //下のと同じ意味
		System.out.println(o1.toString()); //上のと同じ意味
		System.out.println(o2);
		System.out.println(o3);
		
		show(o1);
		Empty e1 = new Empty();
		show(e1);
		
	}
	
	public static void show(Object obj) {
		System.out.println(obj.toString());
	}

}
