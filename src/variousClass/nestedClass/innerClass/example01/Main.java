package variousClass.nestedClass.innerClass.example01;

class Outer {
	int x = 0 ;
	
	static class StaticNested {
		int x = 1 ;
		static int y = 2 ;
		
		void show(){
			System.out.printf("x = %d\n",x) ;
			System.out.printf("this.x = %d\n", this.x) ;
			System.out.printf("this.y = %d\n", this.y) ;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer.StaticNested sn = new Outer.StaticNested();
		sn.show();
		
	}

}
