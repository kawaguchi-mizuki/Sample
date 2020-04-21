package question24;

/**
 * 給料抽象クラス
 *
 */
public abstract class AbstractSalary implements ISalary{

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

		baseSalary();
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
		return "￥" + getTotalSalary() +"-";
	}



}
