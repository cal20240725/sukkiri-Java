package sukkiri.practice.practice_print14.practice06;

public class Main {
	public static void main(String[] args) {
		//ユーザーの総数を表示する
		System.out.println("Total users: " + User.getUserCount());
		
		//Userクラスのインスタンスを生成し、「Alice」、「Bob」、「Charlie」をそれぞれコンストラクタに渡す
		User user1 = new User("Alice");
		User user2 = new User("Bob");
		User user3 = new User("Charlie");
		
		System.out.println("----------------------------------");
		
		//生成した各インスタンスの情報を表示する
		user1.displayUserInfo();
		user2.displayUserInfo();
		user3.displayUserInfo();
		
		System.out.println("----------------------------------");
		
		//再度、ユーザーの総数を表示する
		System.out.println("Total users: " + User.getUserCount());
		
	}

}
