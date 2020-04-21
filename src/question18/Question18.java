package question18;

/**
 * コンストラクタを宣言
 *
 */
public class Question18 extends DogRegister{
	public Question18(String name, String kind) {
		super(name, kind);
	}

	/**
	 * 課題１８
	 * static変数を使って犬の情報を表示
	 */
	public static void main(String[] args) {

		/**犬の登録クラスを配列で宣言**/
		DogRegister[] dogRegister = new DogRegister[2];

		//メソッドを呼び出し格納
		dogRegister =  getDogRegisters();

		//値を受け渡し表示
		disp(dogRegister);
	}

	/**
	 * 犬の情報を受け渡す
	 * @return
	 */
	public static DogRegister[] getDogRegisters() {

		/**犬の登録クラスを配列で宣言**/
		DogRegister[] dogRegister = new DogRegister[2];

		//犬の情報をセット
		dogRegister[0] = new DogRegister("ハチ", "秋田犬");
		dogRegister[1] = new DogRegister("ポチ", "柴犬");

		//犬の情報を返す
		return dogRegister;
	}


	/**
	 * 犬の情報を表示
	 * @param dogRegister
	 */
	public static void disp(DogRegister[] dogRegister) {

		//犬のカウント数を表示
		System.out.println("犬の登録数 : " + getCount());

		//犬の数だけ情報を表示
		for(int i = 0; i < dogRegister.length; i++) {
			//情報を表示する
			System.out.println("登録番号 : " + dogRegister[i].getRegistrationNumber() + " " + dogRegister[i].getDog().getName() +"の情報 : 種類は" + dogRegister[i].getDog().getKind());
		}

	}

}
