package sukkiri.practice.practice_print14.practice06;

public class User {
	//フィールド
	private static int userCount = 0; //staticフィールド
	private int id;
	private String userName;
	
	//引数1つのコンストラクタ
	public User(String userName) {
		//usernameの引数を1つ受け取り、フィールドにセットする
		this.userName = userName;
		//フィールド変数idに関しては、staticなフィールド変数userCountをインクリメントした後、代入する
		userCount++;
		this.id = userCount;
	}
	
	//引数はなく、staticなフィールドを返すstaticメソッド
	public static int getUserCount() {
		return userCount;
	}
	
	//非staticフィールドを表示するインスタンスメソッド
	public void displayUserInfo() {
		System.out.println("User ID: " + this.id);
		System.out.println("UserName: " + this.userName);
	}

}
