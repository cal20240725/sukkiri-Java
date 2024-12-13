package sukkiri.practice.practice_print12.practice02;

public class TravelAgency {
	//planTripメソッド
	//引数にVehicle型を受け取り、戻り値はなし
	public void planTrip(Vehicle vehicle) {
		//引数で渡されたインスタンスのstartメソッド、stopメソッドを呼び出す
		System.out.println("Planning a trip using " + vehicle.getName());
		vehicle.start();
		vehicle.stop();
	}

}
