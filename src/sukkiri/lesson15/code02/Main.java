package sukkiri.lesson15.code02;

public class Main {
	public static void main(String[] args) {
		
		String s1 = "Java and JavaScript";
		
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		} else {
			System.out.println("文字列s1は、Javaが末尾にありません");
		}
		//先頭から数える
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		//末尾から探して、先頭から数える
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
