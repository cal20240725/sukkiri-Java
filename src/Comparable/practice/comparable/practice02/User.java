package Comparable.practice.comparable.practice02;

import java.time.LocalDateTime;

public class User implements Comparable<User>{
	//フィールド
	private String userName;
	private LocalDateTime registrationDate;

	//コンストラクタ
	public User(String userName, LocalDateTime registrationDate) {
		//引数を2つ受け取り、フィールドにセット
		this.userName = userName;
		this.registrationDate = registrationDate;
	}

	//compareToメソッド
	//オーバーライドして、実装する
	@Override
	public int compareTo(User user) {
		//自身のクラスのインスタンスを受け取り、自身と受け取ったインスタンスの登録日時を比較し、
		//その結果を返す
		return this.registrationDate.compareTo(user.registrationDate);
	}

	//別解
	//	@Override
	//	public int compareTo(User user) {
	//		if(this.registrationDate.isBefore(user.registrationDate)) {
	//			return 1;
	//		} else if(this.registrationDate.isBefore(user.registrationDate)){
	//			return -1;
	//		} else {
	//			return 0;
	//		}
	//	}

	//getter
	public String getUserName() {
		return this.userName;
	}
	public LocalDateTime getRegistrationDate() {
		return this.registrationDate;
	}

	//setter
	public void setUserName() {
		this.userName = userName;
	}
	public void setRegistrationDate() {
		this.registrationDate = registrationDate;
	}

}
