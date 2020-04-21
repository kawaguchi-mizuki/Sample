package question12;

/**
 * 課題１２
 * 犬の名前を表示する。
 */
public class Question12 {

	public static void main(String[] args) {

		/**犬クラスを宣言する**/
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		//名前をセット
		dog1.setName("クロ");
		dog2.setName("シロ");

		//名前を表示
		System.out.println(dog1.getName());
		System.out.println(dog2.getName());





	}

}
