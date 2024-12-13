package sukkiri.lesson04.code17;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3};// 配列（参照型）
		
		System.out.println("array:" + array);
		
		System.out.println("---------null代入後----------");
		
		array = null;//配列変数にnullを代入
		
		System.out.println("array:" + array);
		
		System.out.println("---------array[0]代入----------");
		
		array[0] = 10;

	}

}
