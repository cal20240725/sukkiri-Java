package sukkiri.practice.practice_print17.practice02;

public class Main {
	public static void main(String[] args) {
		//「NullPointerException」が発生した場合に「null参照があります」と表示するように例外処理
		String str = null;
		
		try {
			int length = str.length();

			System.out.println(length);
			
		} catch (NullPointerException ne) {
			System.out.println("null参照があります");
		}

	}

}
