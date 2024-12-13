package sukkiri.practice.practice_print07.practice03;

public class Person {
	//フィールド
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String job;
	
	//middleName以外を受け取るコンストラクタ(引数が4つ)
	public Person(String firstName, String lastName, int age, String job) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;
	}
	
	//全部を受け取るコンストラクタ(引数が5つ)
	public Person(String firstName, String middleName, String lastName, int age, String job) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;
		
		//模範解答
//		this(firstName, lastName, age, job);
//		this.middleName = middleName;
	}
	
	//fullNameメソッド
	public String fullName() {
		if (middleName == null) {
			return firstName + " " + lastName;
		} else {
			return firstName + " " + middleName + " " + lastName;
		}
		
		//模範解答
//		String name = null;
//		if (this.middleName == null) {
//			name = this.firstName + " " + this.lastName;
//		} else {
//			name = this.firstName + " " + this.middleName + " " + this.lastName;
//		}
//		
//		return name;
		
	}
	
	//showProfileメソッド
	public void showProfile() {
		System.out.println("私の名前は" + fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("仕事は" + this.job + "です");
	}
	
	//getter
	public String getFirstName() {
		return this.firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getAge() {
		return this.age;
	}
	public String getjob() {
		return this.job;
	}
	
	//setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setjob(String job) {
		this.job = job;
	}

}
