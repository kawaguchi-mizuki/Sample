package question24;

/**
 * 福岡地域手当
 *
 */
public class Fukuoka extends AbstractSalary {

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
		allowance = 400 * 31;
	}


}
