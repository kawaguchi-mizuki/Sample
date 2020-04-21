package model;

/**
 * 社員クラス
 *
 */
public class Employee extends Personal {

	/**社員番号の定数**/
	private static final int EMPLOYEE_ID = 100000;
	/**登録開始番号**/
	private static int count = 1;
	/**社員番号**/
	private Integer empId;
	/**給料**/
	private AbstractSalary salary ;

	/**
	 * コンストラクタ生成
	 * @param name
	 * @param isMan
	 */
	public Employee(String name, boolean isMan,AbstractSalary salary) {
		super(name, isMan);

		//メソッド呼び出し
		setEmpId();
		setSalary(salary);

	}
	/**
	 * 社員番号を戻す
	 * @return
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 社員番号を設定
	 * @param empId
	 */
	public void setEmpId() {
		//社員番号を付与
		this.empId = EMPLOYEE_ID + count;
		//カウントを増やす
		count++;
	}

	/**
	 * 給料を戻す
	 * @return
	 */
	public AbstractSalary getSalary() {
		return salary;
	}

	/**
	 * 給料を設定
	 * @param salary
	 */
	public void setSalary(AbstractSalary salary) {

		this.salary = salary;
	}

	/*
	 * メッセージを表示
	 *
	 */
	@Override
	public String toString() {
		return  "【" + this.getEmpId() + "】" + super.toString() +" "+ salary;
	}


}
