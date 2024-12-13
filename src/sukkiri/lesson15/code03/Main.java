package sukkiri.lesson15.code03;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "Java programming";
		
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));//⇒ a programming
		
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));//⇒ a pro
		
		System.out.println("文字列s1の4文字目は" + s1.charAt(3));
		
		System.out.println(s1.replace("a", "A"));
		
		System.out.println(s1.replaceAll("a", "A"));

	}
}
