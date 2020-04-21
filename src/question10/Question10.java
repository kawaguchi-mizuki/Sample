package question10;

/**
 * 課題１０
 * メソッド呼び出し
 */
public class Question10 {

	public static void main(String[] args) {

		/**名前を入力**/
		dispName(null);
		dispName("アルファ太郎");

	}

	/**
	 * nameの値がnullか判定して表示
	 * @param name 入力された名前
	 */
	public static void dispName(String name) {

		//値がnullか判定
		if(name == null) {
			//未設定で表示する
			System.out.println("名前は未設定です。");
		}else {
			//名前を表示する
			System.out.println("名前は" + name + "です。");
		}

	}


}
