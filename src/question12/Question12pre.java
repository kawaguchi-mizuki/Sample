package question12;

/**
 * 課題１２
 * 別クラスからコンストラクタを呼び出す。
 */
public class Question12pre {

	public static void main(String[] args) {

		/**Dogクラスを宣言**/
		Dog dog = new Dog() ;

		//犬の名前をセット
		dog.setName("クロ");

		//犬の名前を表示
		System.out.println("犬の名前は" + dog.getName() + "です");

	}

}
