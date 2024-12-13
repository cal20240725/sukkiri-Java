package sukkiri.practice.practice_print14.practice05;

public class Main {
	public static void main(String[] args) {
		//総動物数を表示する
		System.out.println("Total animals: " + Animal.getTotalAnimals());
		
		//Animalクラスのインスタンスを生成し、「"Dog", 3」、「"Cat", 2」をそれぞれコンストラクタに渡す
		Animal dog = new Animal("Dog", 3);
		
		Animal cat = new Animal("Cat", 2);
		
		System.out.println("-----------------------------");
		
		//生成した各インスタンスの情報を表示する
		dog.displayInfo();
		cat.displayInfo();
		
		System.out.println("-----------------------------");
		
		//再度、総動物数を表示する
		System.out.println("Total animals: " + Animal.getTotalAnimals());
		
	}

}
