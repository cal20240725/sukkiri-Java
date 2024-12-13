package sukkiri.practice.practice_print14.practice03;

public class EmployeeTester {
	public static void main(String[] args) {
		//インスタンスを作成し、配列empsに保存
		Employee[] emps = new Employee[3];
		
		emps[0] = new Employee(101, "ドラえもん", "営業部");
		emps[1] = new Employee(201, "のび太", "総務部");
		emps[2] = new Employee(202, "スネ夫", "総務部");
		
		//配列empsのデータをtoStringメソッドを使ってすべて表示
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].toString());
		}
		
		//確認するデータはEmployeeのインスタンスを作成
		Employee em = new Employee(201, "のび太", "総務部");
		
		//データが存在するかequalsを使用して確認
//		if(emps.equals(em)) {
//			System.out.println("データが存在します。");
//		} else {
//			System.out.println("データが存在しません。");
//		}
		
		//模範解答
		boolean flag = false;
		
		for(int i = 0; i < emps.length; i++) {
			if(emps[i].equals(em)) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("データが存在します。");
		} else {
			System.out.println("データが存在しません。");
		}
		
	}

}
