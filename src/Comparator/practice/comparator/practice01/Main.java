package Comparator.practice.comparator.practice01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//Product型を要素とするArrayListを作成する
		ArrayList<Product> alp = new ArrayList<>();
		
		//Productクラスのインスタンスを3つ生成し、
		//「"Laptop", 899.99」、「"Phone", 599.99」、「Tablet", 349.99」をコンストラクタに渡す
		Product pro1 = new Product("Laptop", 899.99);
		Product pro2 = new Product("Phone", 599.99);
		Product pro3 = new Product("Tablet", 349.99);
		
		//alpに追加
		alp.add(pro1);
		alp.add(pro2);
		alp.add(pro3);
		
		//1行でやる
//		alp.add(new Product("Alice", 30));
//		alp.add(new Product("Bob", 25));
//		alp.add(new Product("Charlie", 35));
		
		//比較基準のインスタンスの生成
		PriceComparator pc = new PriceComparator();
		
		//価格に基づいて商品を昇順でソートし、表示する
		Collections.sort(alp, pc);
		
		for(Product p : alp) {
			System.out.println("Product:" + p.getName() + "    " + "Price:$" + p.getPrice());
		}
		
		System.out.println("--------------------------------");
		
		//価格について降順でソートし、表示する
		Collections.sort(alp, Collections.reverseOrder(pc));
		
		for(Product p : alp) {
			System.out.println("Product:" + p.getName() + "    " + "Price:$" + p.getPrice());
		}
	}

}
