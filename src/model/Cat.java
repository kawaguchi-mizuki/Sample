package model;

/**
 * 猫クラス
 *
 */
public class Cat {

	/**猫の情報を格納**/
	private String name;
	private String kind;

	/**
	 * コンストラクタ生成
	 * @param name
	 * @param kind
	 */
	public Cat(String name, String kind) {

		//名前が未設定の場合
		if(name.equals("")) {
			name = "名前未設定";
		}

		//値を格納
		this.name = name;
		this.kind = kind;
	}

	/**
	 * 猫の名前取得
	 * @return
	 */
	private String getName() {
		return name;
	}

	/**
	 * 猫の名前をセット
	 * @param name
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * 猫の種類取得
	 * @return
	 */
	private String getKind() {
		return kind;
	}

	/**
	 * 猫の種類をセット
	 * @param kind
	 */
	private void setKind(String kind) {
		this.kind = kind;
	}

	public String toString() {

		//メッセージを表示
		return getName() + "の情報 : " + "種類は" + getKind();

	}

}
