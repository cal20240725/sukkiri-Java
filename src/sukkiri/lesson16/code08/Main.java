package sukkiri.lesson16.code08;

import java.util.ArrayList;
import java.util.List;

//Heroクラス
class Hero {
	//フィールド
	public String name;
}

//Mainクラス
public class Main {//publicは1つだけ
	public static void main(String[] args) {

		//Heroインスタンスの生成
		Hero h = new Hero();
		//Hero型インスタンスhのフィールドnameに値をセット
		h.name = "ミナト";
		System.out.println("h.name:" + h.name);

		Hero a = new Hero();
		a.name = "アサカ";
		System.out.println("a.name:" + a.name);

		System.out.println("h:" + h);
		System.out.println("a:" + a);

		//<Hero>型のArrayListインスタンスの生成
		List<Hero> list = new ArrayList<Hero>();
		System.out.println("list:" + list);
		
		//要素を追加
		list.add(h);//hをリストに格納
		System.out.println(list.get(0).name);
		
		//Hero型インスタンスhのフィールドnameに値を再セット
		h.name = "スガワラ";//格納後にhのnameを書き換え
		
		//表示
		System.out.println("list[0]:" + list.get(0));
		System.out.println(list.get(0).name);
		System.out.println("list:" + list);
	}

}
