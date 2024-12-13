package sukkiri.practice.practice_print17.practice05;

public class User {
	int id;
	String name;
	
	public User(int id, String name) {
		if(id < 0) {
			throw new IllegalArgumentException("idが負の数です。");
		}
		this.id = id;
		
		//自分の解答
//		if(name == null || name.length() == 0) {
//			throw new IllegalArgumentException("nameがnullまたは空です。");
//		}
//		this.name = name;
		
		//模範解答
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("nameがnullまたは空です。");
		}
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "IDは" + this.id + "で、名前は" + this.name + "です。";
	}

}
