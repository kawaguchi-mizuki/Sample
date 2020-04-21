package question27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 課題２７
 * ArrayListクラス
 */
public class Question27 {

	public static void main(String[] args) {

		/**色の配列をListで宣言**/
		List<String> colorList = new ArrayList<String>(Arrays.asList("赤","青","白","緑"));

		//Listの中身を表示するメソッド呼び出し
		getList(colorList);

		//Listの中身を削除するメソッド呼び出し
		removeList(colorList);

		//Listの中身を表示するメソッド呼び出し
		getList(colorList);

	}

	/**
	 * Listの要素１番目を削除する
	 * @param colorList
	 */
	private static void removeList(List<String> colorList) {

		//メッセージを表示
		System.out.println( colorList.get(1) + "(1番目のデータ)を削除します");
		System.out.println();

		//Listの要素１番目を削除
		colorList.remove(1);
	}

	/**
	 * Listの中身を表示
	 * @param colorList
	 */
	private static void getList(List<String> colorList) {

		//メッセージを表示
		System.out.println("--現在登録されているデータ--");
		System.out.println(colorList.toString());
		System.out.println();

	}

}
