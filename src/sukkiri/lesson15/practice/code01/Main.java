package sukkiri.lesson15.practice.code01;

public class Main {
	public static void main(String[] args) {
		
		//StringBuilderインスタンスを作成
		StringBuilder sb = new StringBuilder();
		
		//連結
		for (int i = 1; i <= 100; i++) {
			sb.append(i);
			sb.append(",");
			//sb.append(i + ",");
		}
		
		//StringBuilder型変数からString型変数に格納
		String s = sb.toString();
		
		//表示
		System.out.println(s);
		
		//完成した文字列sをカンマで分割し、String働いてaに格納
		String[] a = s.split("[,]");
		
		for (String num : a) {
			System.out.println(num);
		}
		
	}

}
