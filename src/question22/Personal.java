package question22;

/**
 * 人クラス
 * @author 81702
 *
 */
public class Personal {


	/**名前を格納**/
	private String name;
	/**性別を格納**/
	private boolean isMan;

	/**
	 * コンストラクタ生成
	 * @param name
	 * @param isMan
	 */
	public Personal(String name, boolean isMan) {
		this.name = name;
		this.isMan = isMan;
	}

	/**
	 * 名前を取得
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前をセット
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 性別を取得
	 * @return
	 */
	public boolean isMan() {
		return isMan;
	}

	/**
	 * 性別をセット
	 * @param isMan
	 */
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	/*
	 * メソッドをオーバーライド
	 */
	@Override
	public String toString() {

		//性別を判定
		if(isMan == true) {
			//男性を返す
			return name + "(男性)";
		}else {
			//女性を返す
			return name + "(女性)";
		}
	}
}
