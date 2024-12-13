package sukkiri.lesson05.practice.practice04;

public class Main {
	/*
	 *name:calcTriangleArea
	 *引数:double bottom, double height
	 *戻り値:ans
	 *処理:引数で受け取った底辺長と高さから、三角形の面積を求めて戻す
	 */
	public static double calcTriangleArea(double bottom, double height) {
		
		double ans = bottom * height / 2;
		System.out.println("三角形の底辺の長さが" + bottom + "cm、" + "高さが" + height 
							+ "cmの場合、" + "面積は" + ans + "平方cm");
		return ans;
	}
	/*
	 *name:calcCircleArea
	 *引数:double radius
	 *戻り値:ans
	 *処理:引数で受け取った半径から、円の面積を求めて戻す
	 */
	public static double calcCircleArea(double radius) {
		
		double ans = radius * radius * 3.14;
		System.out.println("円の半径が" + radius + "cmの場合、" + "面積は" + ans + "平方cm");
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		double bottom = 10;
		double height = 5;
		calcTriangleArea(bottom, height);
		
		double radius = 5;
		calcCircleArea(radius);
	}

}
