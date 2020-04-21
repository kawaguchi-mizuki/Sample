package question18;

import model.Dog;

/**
 * 課題１８
 * 犬の登録クラス
 */
public class DogRegister{

	/**犬の登録数**/
	static int count = 0;
	/**登録番号**/
	static int registrationNumber = 0;
	/**犬クラスを宣言**/
	Dog dog = new Dog();


	/**
	 * 犬の情報をセット
	 * @param name
	 * @param kind
	 */
	public DogRegister(String name , String kind) {

		//犬の情報を格納
		dog.setName(name);
		dog.setKind(kind);

		//犬の情報をカウント
		count++;
	}

	/**
	 * 犬のカウント数を取得
	 * @return
	 */
	public static int getCount() {

		return count;
	}

	/**
	 * 犬の登録番号を取得
	 * @return
	 */
	public int getRegistrationNumber() {

		//登録番号を増やす
		registrationNumber++;
		return registrationNumber;
	}


	/**
	 * 犬の登録番号をセット
	 * @param count
	 */
	public void setRegistrationNumber(int count) {

	}


	/**
	 *
	 * @return
	 */
	public Dog getDog() {

		return dog;
	}


}
