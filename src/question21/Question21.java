package question21;

import model.CatAvatar;

public class Question21 {

	/**
	 * 課題２１
	 * メソッドのオーバーライド
	 * @param args
	 */
	public static void main(String[] args) {

		/**猫の拡張クラスを宣言**/
		CatAvatar[] catAva = new CatAvatar[3];
		//メソッドを呼び出して格納
		catAva = getCatAvatars();
		//猫の情報を表示するメソッド呼び出し
		disp(catAva);

	}

	/**
	 * 猫の情報を受け渡す
	 * @return
	 */
	private static CatAvatar[] getCatAvatars() {

		/**猫の拡張クラスを宣言**/
		CatAvatar[] catAva = new CatAvatar[3];

		//猫の情報を格納
		catAva[0] = new CatAvatar("タマ", "三毛猫", 1);
		catAva[1] = new CatAvatar("ジジ", "黒猫", 5);
		catAva[2] = new CatAvatar("", "雑種", -1);

		//値を返す
		return catAva;
	}

	/**
	 * 猫の情報を表示
	 * @param catAva
	 */
	private static void disp(CatAvatar[] catAva) {

		//猫の数だけループ
		for(int i = 0; i < catAva.length; i++) {
			//猫の情報を表示
			System.out.println(catAva[i].toString());
		}
	}

}
