package sukkiri.lesson13.sample03;

public class Main {
	public static void main(String[] args) {
		//エラーになる方
		Hero h = new Hero();
		h.setName("");
		
		//エラーにならない方
//		Hero minato = new Hero();
//		minato.setName("ミナト");
//		System.out.println(minato.getName());
		
	}

}
