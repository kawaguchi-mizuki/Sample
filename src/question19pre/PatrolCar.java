package question19pre;

/**
 * 課題１９ pre
 * パトカークラス
 */
public class PatrolCar extends Car {

	/**
	 * パトカーの最高速度
	 */
	public PatrolCar() {
		super();
		this.maxSpeed = 200;
	}

	/**
	 * コンストラクタ
	 */
	public PatrolCar(int maxSpeed) {
		//親クラスのコンストラクタ継承
		super(maxSpeed);
	}

	/**
	 * ヘッドライト点灯表示
	 */
	public void light() {
		super.light();
		System.out.println("パトライトが点灯します");
	}

	/**
	 * サイレン表示
	 */
	public void siren() {
		System.out.println("サイレンが鳴ります");
	}
}
