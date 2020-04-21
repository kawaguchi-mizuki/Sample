package question13;

import model.Dog;

/**
 * 課題１３
 * modelのDogクラスを利用して犬の情報を表示する。
 */
public class Question13 {

	public static void main(String[] args) {

		/**犬クラスを生成**/
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("ポチ","柴犬");

		//犬の名前と種類を表示
		System.out.println(dog1.getName() + "の情報 : " + "種類は" + dog1.getKind());
		System.out.println(dog2.getName() + "の情報 : " + "種類は" + dog2.getKind());

	}

}
