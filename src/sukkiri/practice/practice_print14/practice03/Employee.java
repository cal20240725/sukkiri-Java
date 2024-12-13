package sukkiri.practice.practice_print14.practice03;

public class Employee {
	//フィールド
	private int id;
	private String name;
	private String dept;
	
	//引数3つのコンストラクタ
	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	//toStringをオーバーライドし、文字列を返す
	@Override
	public String toString() {
		return "社員番号：" + getId() + "、名前：" + getName() + "、部署：" + getDept();
	}
	
	//equalsをオーバーライドし、社員番号、名前、部署がすべて同じならtrue、違う場合はfalseを返す
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Employee emp) {
			if(getId() == emp.getId() && getName().equals(emp.getName()) && getDept().equals(emp.getDept())) {
				return true;
			}
		}
		return false;
	}
	
	//getter
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getDept() {
		return this.dept;
	}
	
	//setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
