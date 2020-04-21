package question15;

import model.Dog;

/**
 * 課題１５
 * １４を変更して犬の名前と種類を表示
 */
public class Question15 {

	public static void main(String[] args) {

		/**犬クラスを配列で宣言して値を格納**/
		Dog[] dogs = getDogs();

		//犬クラスの情報を渡す
		disp(dogs);
	}

	/**
	 * 犬のデータ格納用
	 * @return
	 */
	private static Dog[] getDogs() {

		/**犬クラスを配列で宣言**/
		Dog[] dog = new Dog[2] ;

		/**犬のデータを格納**/
		dog[0] = new Dog("ハチ","秋田犬");
		dog[1] = new Dog("ポチ","柴犬");

		return dog;
	}

	/**
	 * 犬のデータの数ループ
	 * @param dogs
	 */
	public static void disp(Dog[] dogs) {

		//犬のデータの数だけ処理を繰り返す
		for(Dog dog : dogs) {
			//犬の情報を受け渡す
			disp(dog);
		}
	}

	/**
	 * 犬の名前と種類を表示
	 * @param dog
	 */
	private static void disp(Dog dog) {

		//犬の名前と種類を表示
		System.out.println(dog.getName() + "の情報 : " + "種類は" + dog.getKind());

	}

}
