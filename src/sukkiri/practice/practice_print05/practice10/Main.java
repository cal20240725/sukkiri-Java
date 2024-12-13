package sukkiri.practice.practice_print05.practice10;

import java.util.Scanner;

public class Main {
	/*
	 *メソッド名:inputNumber、numberToMessage、showMessage
	 *引数:
	 *戻り値:
	 *処理:
	 */
	/*
	public static void main(String[] args) {
		int  inNumber ;
		//キー入力部分
		Scanner sc = new Scanner( System.in );
		System.out.print(" Input no. : ");
		inNumber = sc.nextInt();
		//処理部分
		String msg = "" ;
		switch( inNumber ){
			case 1 :
				msg = "Good Morning" ; 
				break ;
			case 2 :
				msg = "Good Afternoon" ; 
				break ;
			case 3 : 
				msg = "Good Evening" ; 
		}
		//表示部分
		System.out.println( msg ) ;
	}
	 */

	public static int inputNumber() {//キー入力メソッド
		Scanner sc = new Scanner( System.in );
		System.out.print(" Input no. : ");
		int input = sc.nextInt();

		return input;
	}

	public static String numberToMessage(int inNumber) {//処理メソッド
		String msg = "" ;
		switch( inNumber ){
		case 1 :
			msg = "Good Morning" ; 
			break ;
		case 2 :
			msg = "Good Afternoon" ; 
			break ;
		case 3 : 
			msg = "Good Evening" ;
		}
		
		return msg;
	}

	public static void showMessage(String msg) {//表示メソッド
		
		System.out.println(msg);
	}

	public static void main(String[] args) {
		//キー入力メソッドの呼び出し、戻り値を変数に代入
		int inputNumber = inputNumber();
		//処理メソッドの呼び出し、戻り値を変数に代入
		String msg = numberToMessage(inputNumber);
		//表示メソッドの呼び出し
		showMessage(msg);
		
		//showMessage(numberToMessage(inputNumber())); 1行で書くやり方
	}
}
