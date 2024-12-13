package sukkiri.lesson05.practice.practice01;

public class Main {
	/*
	 *name:introduceOneself
	 *戻り値:なし
	 *引数:なし
	 *処理:変数を初期化して、コンソールに表示
	 */
	public static void introduceOneself() {
		String name = "湊雄輔";
		int age = 22;
		double size = 169.9;
		char eto = '辰';
		
		System.out.println("私の名前は" + name + "です。");
		System.out.println("歳は" + age + "歳です。");
		System.out.println("身長は" + size + "cmです。");
		System.out.println("十二支は" + eto + "です。");
	}
	
	public static void main(String[] args) {
		introduceOneself();
	}

}
