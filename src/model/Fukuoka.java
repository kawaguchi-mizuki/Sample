package model;

/**
 * 福岡地域手当
 *
 */
public class Fukuoka extends AbstractSalary {

	/* 手当を計算するメソッド
	 *
	 */
	@Override
	public void setAllowance() {

		//手当計算
		allowance = 400 * 31;
	}


}
