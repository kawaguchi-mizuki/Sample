package question14;

import model.Dog;

/**
 * 課題１４
 * １３を配列利用して表示。
 */
public class Question14 {

	public static void main(String[] args) {

		/**犬クラスを配列で宣言**/
		Dog dog[] = new Dog[2];

		//値を格納
		dog[0] = new Dog();
		dog[1] = new Dog("ポチ","柴犬");

		//犬の名前と種類を表示
		System.out.println(dog[0].getName() + "の情報 : " + "種類は" + dog[0].getKind());
		System.out.println(dog[1].getName() + "の情報 : " + "種類は" + dog[1].getKind());


	}

}
