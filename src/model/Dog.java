package model;

/**
 * 課題１３
 * Dogクラス
 */
public class Dog {

	/**名前と種類を格納**/
	private String name;
	private String kind;



	/**
	 * コンストラクタ
	 */
	public Dog() {

		this("未入力","未入力");
	}

	/**
	 * @param name
	 * @param kind
	 */
	public Dog(String name, String kind) {

		//初期化

		//名前が未設定の場合
		if(name.equals("")) {
			name = "名前未設定";
		}

		this.name = name;
		this.kind = kind;
	}

	/**
	 * 名前を返す
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
	 * 種類を返す
	 * @return
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * 種類をセット
	 * @param kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
}
