package question19pre;

/**
 * 課題１９ pre
 * 車クラス
 */
public class Car {

	/**最高時速を格納**/
	public int maxSpeed;

	/**
	 * 一般車の最高速度
	 */
	public Car() {
		this.maxSpeed = 100;
	}

	/**
	 * コンストラクタ
	 */
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * 最高速度を表示
	 */
	public void maxSpeed() {
		System.out.println("最高速度は" + maxSpeed + "kmです");
	}

	/**
	 * ヘッドライト点灯表示
	 */
	public void light() {
		System.out.println("ヘッドライトが点灯します");
	}
}
