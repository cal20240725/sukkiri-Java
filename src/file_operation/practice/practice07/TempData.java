package file_operation.practice.practice07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TempData {
	//フィールド
	private Date Date;
	private double aveTemp;
	private double maxTemp;
	private double minTemp;
	
	//コンストラクタ
	public TempData(Date Date, double aveTemp, double maxTemp, double minTemp) {
		//フィールドに対応した４つの引数を受け取り、setterを使って値をセットする
		this.Date = Date;
		this.aveTemp = aveTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}
	
	//メソッド
	public String strDate() {
		//Date型をString型に変換して値を返す
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		String sd = f.format(this.Date);
		return sd;
	}
	
	//getter
	public Date getDate() {
		return this.Date;
	}
	public double getAveTemp() {
		return this.aveTemp;
	}
	public double getMaxTemp() {
		return this.maxTemp;
	}
	public double getMinTemp() {
		return this.minTemp;
	}
	
	//setter
	public void setDate(java.util.Date Date) {
		this.Date = Date;
	}
	public void setAveTemp(double aveTemp) {
		this.aveTemp = aveTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
}
