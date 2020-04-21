package model;

public class CatAvatar extends Cat {

	/**猫の年齢を格納**/
	private int age;

	/**
	 * コンストラクタ生成
	 * @param name
	 * @param kind
	 * @param age
	 */
	public CatAvatar(String name, String kind, int age) {
		super(name, kind);

		//犬の年齢が０以下の場合０にする
		if(age < 0) {
			age = 0;
		}

		this.age = age;
	}


	/**
	 * 年齢を取得
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 年齢をセット
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/*
	 * メソッドのオーバーライド
	 *
	 */
	@Override
	public String toString() {

		//メッセージを表示
		return super.toString() +  "で、年齢は" + getAge() + "才";
	}



}
