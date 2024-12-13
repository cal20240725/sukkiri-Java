package variousClass.nestedClass.practice.practice01;

import variousClass.nestedClass.practice.practice01.Person.PersonBuilder;

public class Main {
	public static void main(String[] args) {
		//Personインスタンスを生成(Personクラス、PersonBuilderクラスを利用する)
		PersonBuilder pb = Person.builder();
		pb.name("Alice");
		pb.age(30);
		Person person = pb.build();
		
		//生成したインスタンスのフィールドを表示
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		
		System.out.println("---------------------------");
		
		Person p = Person.builder()
				.name("Bob")
				.age(35)
				.build();
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		
	}

}
