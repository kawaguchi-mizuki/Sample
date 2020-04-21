package model;

/**
 * 給料抽象クラス
 *
 */
public abstract class AbstractSalary {

	/**基本給**/
	private static final int BASE_SALARY = 180000;
	/**総支払額**/
	private int totalSalary = 0;
	/**手当**/
	 int allowance = 0;

	/**
	 * メソッド呼び出し
	 */
	public AbstractSalary() {

		setAllowance();
		setTotalSalary();
	}

	/**
	 * 総支払額を戻す
	 * @return
	 */
	public int getTotalSalary() {

		return totalSalary;
	}

	/**
	 * 総支払額を計算
	 */
	public void setTotalSalary() {
		//給料計算
		this.totalSalary = BASE_SALARY + getAllowance();
	}

	/**
	 * 手当を戻す
	 * @return
	 */
	public int getAllowance() {
		return allowance;
	}

	/**
	 * 抽象メソッド
	 */
	abstract public void setAllowance();

	@Override
	public String toString() {
		return "\\" + getTotalSalary() +"-";
	}



}
