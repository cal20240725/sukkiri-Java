package sukkiri.practice.practice_print11.practice02;

public class ElectronicProduct extends Product { //Productクラスを実装
	//引数3つのコンストラクタ
	public ElectronicProduct(String categoryName, String productName, double price) {
		//引数を3つ受け取り、親クラスのコンストラクタに渡す
		super(categoryName, productName, price);
	}
	
	//オーバーライドして実装
	@Override
	public void displayCategoryInfo() {
		//カテゴリー名を表示する
		System.out.println("Category: " + super.categoryName);//this.categoryNameやgetCategoryName()でも可
	}
	
	//オーバーライドして実装
	@Override
	public void displayProductInfo() {
		//displayCategoryInfoメソッドを呼び出し、カテゴリー名を表示する
		displayCategoryInfo();
		//製品名を表示する
		System.out.println("Product: " + super.productName);//this.productNameやgetProductName()でも可
		//価格を表示する
		System.out.println("Price: $" + super.price);//this.priceやgetPrice()でも可
		//商品説明を表示する
		System.out.println("This is an electronic product.");
	}

}
