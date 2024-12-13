package sukkiri.practice.practice_print10.practice01;

public class Cat extends Animal{
	//差分フィールド
	String name;
	String cry;
	
	//必要性つのコンストラクタ
	public Cat(String name, String cry) {
//		super.setKind("猫");
		super("猫"); //模範解答
		this.name = name;
		this.cry = cry;
	}
	
	//showProfileメソッドをオーバーライド
	@Override
	public void showProfile() {
		System.out.println("-------------------");
		super.showProfile();
//		System.out.println("種は" + super.getKind());
		System.out.println("種は" + super.kind); //模範解答
		System.out.println("名前は" + this.name);
		System.out.println("鳴き声は" + this.cry);
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public String getCry() {
		return this.cry;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setCry(String cry) {
		this.cry = cry;
	}

}
