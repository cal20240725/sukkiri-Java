package Comparator.practice.comparator.practice01;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
	//模範解答1
	@Override
	public int compare(Product product1, Product product2) {
		//第1引数と第2引数が負なら-1を返す
		if(product1.getPrice() <  product2.getPrice()) {
			return -1;
			//第1引数と第2引数が正なら1を返す
		} else if(product1.getPrice() >  product2.getPrice()) {
			return 1;
			//第1引数と第2引数が等しければ0を返す
		} else {
			return 0;
		}
	}

	//模範解答2
	//	@Override
	//	public int compare(Product product1, Product product2) {
	//		return Double.compare(product1.getPrice(), product2.getPrice());
	//	}

}
