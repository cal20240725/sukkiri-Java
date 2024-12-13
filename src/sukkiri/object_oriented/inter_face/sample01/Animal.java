package sukkiri.object_oriented.inter_face.sample01;

public interface Animal { //①インタフェース
	//フィールド
	static final String livingBeing = "動物"; //②インタフェースのフィールド
	
	//抽象メソッド
	void run(); //③抽象メソッド
	
	//デフォルトメソッド
	default void showLivingBeing() { //④デフォルトメソッド
	System.out.println(livingBeing);
	 }


}
