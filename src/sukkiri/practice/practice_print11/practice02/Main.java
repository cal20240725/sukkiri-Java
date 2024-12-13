package sukkiri.practice.practice_print11.practice02;

public class Main {
	public static void main(String[] args) {
		//ElectronicProductクラスのインスタンスを生成し、
		//「"Electronics", "Laptop", 999.99」をコンストラクタに渡す
		ElectronicProduct ep = new ElectronicProduct("Electronics", "Laptop", 999.99);
		
		//displayCategoryInfoメソッドを呼び出す
		ep.displayCategoryInfo();
		
		System.out.println("-------------------------------------");
		
		//displayProductInfoメソッドを呼び出す
		ep.displayProductInfo();
		
	}

}
