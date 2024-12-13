package sukkiri.practice.practice_print11.practice02;

public abstract class Product extends Category { //抽象クラス、Categoryクラスを継承
	//フィールド
	String productName;
	double price;
	
	//引数3つのコンストラクタ
	public Product(String categoryName, String productName, double price) {
		//引数を3つ受け取り、１つは親クラスのコンストラクタに渡す
		super(categoryName);
		//残りはフィールドにセット
		this.productName = productName;
		this.price = price;
	}
	
	//抽象メソッド
	public abstract void displayProductInfo();
	
	//getter
	public String getProductName() {
		return this.productName;
	}
	public double getPrice() {
		return this.price;
	}
	
	//setter
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
