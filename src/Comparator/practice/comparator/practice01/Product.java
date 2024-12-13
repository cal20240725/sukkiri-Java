package Comparator.practice.comparator.practice01;

public class Product {
	//フィールド
	private String name;
	private double price;
	
	//コンストラクタ
	public Product(String name, double price) {
		//引数を2つ受け取り、フィールドにセット
		this.name = name;
		this.price = price;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
