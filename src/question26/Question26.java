package question26;

/**
 * 課題２６
 * 独自の例外クラス
 *
 */
public class Question26 {

	public static void main(String[] args) throws PythangorasException {

		/**辺の長さ**/
		int[][] nums = {{3,4,5},{2,-2,1},{2,2,3},{5,3,4}};

		/**ピタゴラスクラスを宣言**/
		Pythagoras[] ptg = new Pythagoras[nums.length];

		//データの数だけループ
		for(int i = 0; i < nums.length; i++) {

			//表示メッセージ
			System.out.print(i+1);
			System.out.print("番目のデータ:");

			//メソッド呼び出し
			getPythagoras(nums[i][0], nums[i][1], nums[i][2]);
		}

	}

	/**
	 * データの受け渡し
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 * @throws PythangorasException
	 */
	public static Pythagoras[] getPythagoras(int num1, int num2, int num3) throws PythangorasException {

		/**ピタゴラスクラスを宣言**/
		Pythagoras[] ptg = new Pythagoras[4];

		//例外があるか確認
		try {

			//０以下の数値が入っているか判定
			if (num1 < 0 || num2 < 0 || num3 < 0) {
				//例外処理
				throw new PythangorasException("");
			}

			//値を受け渡す
			ptg[0] = new Pythagoras(num1, num2, num3, false);

			//メソッド呼び出し
			ptg[0].isRightTriangle();

			//メッセージを表示
			System.out.print("[" + num1 + "," + num2 + "," + num3);
			System.out.println("] " + ptg[0].toString());

		//例外処理
		} catch (Exception e) {
			//メッセージを表示
			System.out.println("0以下の数値は判定不可能");
		}

		return ptg;
	}

}
