package model;

/**
 * Dogクラスを拡張したクラス
 *
 */
public class DogAvatar20 extends Dog {

	/**犬の年齢**/
	private Integer age = 0;

	private String name = "";

	/**
	 * コンストラクタ
	 * @param name
	 * @param kind
	 * @param age
	 */
	public DogAvatar20(String name, String kind, Integer age) {

		super(name,kind);

		//犬の年齢が０以下の場合０にする
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}

	/**
	 * 犬の年齢を取得
	 * @return
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 犬の年齢をセット
	 * @param age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/*
	 * メソッドのオーバーライド
	 * 名前をセット
	 */
	@Override
	public void setName(String name) {

		super.setName(name);
	}

}
