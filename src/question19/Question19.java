package question19;

import model.DogAvatar;

public class Question19 {

	/**
	 * 課題１９
	 * クラスの継承
	 */
	public static void main(String[] args) {

		/**犬の拡張クラスを宣言**/
		DogAvatar[] dogAva = new DogAvatar[3];

		//メソッドを呼び出して格納
		dogAva = getDogAvatars();

		//犬の情報を表示するメソッド呼び出し
		disp(dogAva);
	}

	/**
	 * 犬の情報を受け渡す
	 * @return
	 */
	public static DogAvatar[] getDogAvatars() {

		/**犬の拡張クラスを宣言**/
		DogAvatar[] dogAva = new DogAvatar[3];

		//犬の情報を格納
		dogAva[0] = new DogAvatar("ハチ", "秋田犬", 1);
		dogAva[1] = new DogAvatar("ポチ", "柴犬", 5);
		dogAva[2] = new DogAvatar("", "雑種", -1);

		//値を返す
		return dogAva;

	}

	/**
	 * 犬の情報を表示
	 * @param dogAva
	 */
	private static void disp(DogAvatar[] dogAva) {

		//犬の数だけループ
		for(int i = 0; i < dogAva.length; i++) {
			//犬の情報を表示
			System.out.println(dogAva[i].getName() + "の情報 : " + "種類は" + dogAva[i].getKind() + "で、年齢は" + dogAva[i].getAge() + "才");
		}


	}

}
