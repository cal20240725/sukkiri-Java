package sukkiri.practice.practice_print14.practice02;

public class Main {
	public static void main(String[] args) {
		//「"Alice", 25」のフィールドをもつuser1インスタンスを生成する
		User user1 = new User("Alice", 25);
		//「"Bob", 30」のフィールドをもつuser2インスタンスを生成する
		User user2 = new User("Bob", 30);
		//「"Alice", 25」のフィールドをもつuser3インスタンスを生成する
		User user3 = new User("Alice", 25);
		
		//「user1とuser2」、「user1とuser3」をequalsメソッドを用いて比較し、戻り値を表示する
		System.out.println("user1 equals user2: " + user1.equals(user2));
		System.out.println("user1 equals user3: " + user1.equals(user3));
		
	}

}
