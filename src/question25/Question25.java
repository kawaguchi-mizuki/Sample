package question25;

/**
 * 課題２５
 * 例外処理
 */
public class Question25 {

	public static void main(String[] args) {

		/**渡された引数の数を格納**/
		int argumentLen = args.length ;

		//引数が２つの場合
		if(argumentLen == 2) {

			//引数が文字を含むか確認
			try {

				/**第１引数を格納**/
				int num1 = Integer.parseInt(args[0]);
				/**第２引数を格納**/
				int num2 = Integer.parseInt(args[1]);

				add(num1,num2);
				sub(num1,num2);
				mul(num1,num2);
				div(num1,num2);

			//文字を含む場合
			} catch (NumberFormatException e) {
				//エラーメッセージを表示
				System.out.println("整数以外の引数が入っています");
			}

		//引数が２つ以外の場合
		}else {
			//エラーメッセージを表示
			System.out.println("引数が２つではありませんｓ");
		}

	}

	/**
	 * 割り算結果
	 * @param num1
	 * @param num2
	 */
	private static void div(int num1, int num2) {

		//０で除算してないか確認
		try {
			//足し算結果表示
			System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
		} catch (ArithmeticException e) {
			//エラーメッセージを表示
			System.out.println(e);
		}
	}

	/**
	 * 掛け算結果
	 * @param num1
	 * @param num2
	 */
	private static void mul(int num1, int num2) {


		//かけ算結果表示
		System.out.print(num1 + " * " + num2 + " = ");
		System.out.println(num1 * num2);
	}

	/**
	 * 引き算結果
	 * @param num1
	 * @param num2
	 */
	private static void sub(int num1, int num2) {

		//足し算結果表示
		System.out.print(num1 + " - " + num2 + " = ");
		System.out.println(num1 - num2);
	}

	/**
	 * 足し算結果
	 * @param num1
	 * @param num2
	 */
	private static void add(int num1, int num2) {

		//足し算結果表示
		System.out.print(num1 + " + " + num2 + " = ");
		System.out.println(num1 + num2);
	}

}
