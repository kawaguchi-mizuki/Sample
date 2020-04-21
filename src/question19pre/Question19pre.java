package question19pre;

public class Question19pre {

	/**
	 * 課題１９ pre
	 * クラスの継承
	 * @param args
	 */
	public static void main(String[] args) {

		/**車クラスを宣言**/
		Car car = new Car();

		//メッセージを表示
		System.out.println("--- 一般車 ---");
		//車クラスのメソッド呼び出し
		car.maxSpeed();
		car.light();

		/**パトカークラスを宣言**/
		PatrolCar pat = new PatrolCar();

		//メッセージを表示
		System.out.println("--- パトカー ---");
		//パトカークラスのメソッド呼び出し
		pat.maxSpeed();
		pat.light();
		pat.siren();



	}

}
