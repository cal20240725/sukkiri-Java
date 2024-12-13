package sukkiri.practice.practice_print12.practice02;

public class Main {
	public static void main(String[] args) {
		//TravelAgencyクラスのインスタンスを生成する
		TravelAgency travelagency = new TravelAgency();
		
		//Carクラスのインスタンスを生成し、「Toyota」をコンストラクタに渡す
//		Car car = new Car("Toyota");
		//模範解答
		Vehicle car = new Car("Toyota"); //より大きい型に入れる
		
		//Bicycleクラスのインスタンスを生成し、「Mountain Bike」をコンストラクタに渡す
//		Bicycle bicycle = new Bicycle("Mountain Bike");
		//模範解答
		Vehicle bicycle = new Bicycle("Mountain Bike"); //より大きい型に入れる
		
		//各インスタンスを引数に渡し、planTripメソッドを呼び出す
		travelagency.planTrip(car);
		
		System.out.println("------------------------");
		
		travelagency.planTrip(bicycle);
		
	}

}
