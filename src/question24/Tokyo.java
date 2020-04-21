package question24;

/**
 * 東京地域手当
 *
 */
public class Tokyo extends AbstractSalary {


	@Override
	public void baseSalary() {
		// TODO 自動生成されたメソッド・スタブ

	}
	/* 手当を計算するメソッド
	 *
	 */
	@Override
	public void setAllowance() {

		//手当計算
		allowance = 1500 * 31;
	}

}
