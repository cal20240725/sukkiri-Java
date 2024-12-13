package sukkiri.practice.practice_print11.practice02;

public abstract class Category { //抽象クラス
	//フィールド
	String categoryName;
	
	//引数1つのコンストラクタ
	public Category(String categoryName) {
		//引数を1つ受け取り、フィールドにセット
		this.categoryName = categoryName;
	}
	
	//抽象メソッド
	public abstract void displayCategoryInfo();
	
	//getter
	public String getCategoryName() {
		return this.categoryName;
	}
	
	//setter
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
