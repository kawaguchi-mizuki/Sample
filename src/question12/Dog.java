package question12;

/**
 * 課題１２
 * Dogクラス
 */
public class Dog {

	/**犬の名前を格納**/
	private String name ;


	public Dog() {
		//メッセージを表示
		System.out.println("コンストラクタが呼ばれました");
	}


	/**
	 * 名前を返す
	 * @return
	 */
	public String getName() {

		return name;
	}

	/**
	 * 名前をセットする
	 * @param name
	 */
	public void setName(String name) {

		this.name = name;
	}

}
