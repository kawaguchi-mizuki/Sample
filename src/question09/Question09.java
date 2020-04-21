package question09;

/**
 * 課題９
 * endが含まれるまで整数を受け取り合計を出力表示する。
 */
public class Question09 {

	public static void main(String[] args) {

		/**渡された引数の数を格納**/
		int argumentLen = args.length ;
		/**整数の合計値**/
		int total = 0 ;
		/**引数の要素番号**/
		int count = 0 ;

		//引数が１つ以上ある場合
		if(argumentLen != 0) {

			//受け取った引数の数だけループ
			while(count < argumentLen) {

				//引数がendが判定
				if(args[count].equals("end")) {
					//ループを抜ける
					break;
					//引数がendではない場合
				}else {
					//合計値に加算
					total = total + Integer.parseInt(args[count]) ;
				}
				//要素番号を加算
				count++;
			}

			//合計値を表示する
			System.out.println("合計は " + total + " です。");

			//引数が０の場合
		}else {
			//エラーメッセージを表示
			System.out.println("コマンドラインで、整数値を１つ以上引き渡してください。");
		}
	}

}
