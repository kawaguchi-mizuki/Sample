package question26;

/**
 * ピタゴラスクラス
 *
 */
public class Pythagoras {

	/**辺の長さ格納**/
	private int lineA;
	private int lineB;
	private int lineC;

	/**真偽値格納**/
	private boolean isRightTriangle;

	/**
	 * コンストラクタ生成
	 * @param lineA
	 * @param lineB
	 * @param lineC
	 * @param isRightTriangle
	 */
	public Pythagoras(int lineA, int lineB, int lineC, boolean isRightTriangle) throws PythangorasException {
		super();

		//初期化
		this.lineA = lineA;
		this.lineB = lineB;
		this.lineC = lineC;
		this.isRightTriangle = isRightTriangle;
	}

	/**
	 * 直角三角形かどうか判定
	 * @return
	 */
	public boolean isRightTriangle() {

		//数値の最大値格納
		int max = 0;
		//最大値以外格納
		int second = 0;
		int third = 0;

		//最大値を求める判定
		if(this.lineA > this.lineB && this.lineA > this.lineC) {
			//第１引数が最大値の場合
			max = this.lineA;
			second = this.lineB;
			third = this.lineC;
		}else if(this.lineB > this.lineA && this.lineB > this.lineC) {
			//第２引数が最大値の場合
			max = this.lineB;
			second = this.lineA;
			third = this.lineC;
		}else if(this.lineC > this.lineA && this.lineC > this.lineB) {
			//第３引数が最大値の場合
			max = this.lineC;
			second = this.lineA;
			third = this.lineB;
		}

		//直角三角形か判定
		if((third * third + second * second) == max * max) {
			//真にする
			this.isRightTriangle = true;
		}else {
			//偽にする
			this.isRightTriangle = false;
		}

		return this.isRightTriangle;
	}

	/*
	 * メッセージを表示
	 */
	@Override
	public String toString() {
		//メッセージを表示
		return "【" + this.isRightTriangle + "】";
	}




}
