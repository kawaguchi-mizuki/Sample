package question11;

/**
 * 課題１１
 * 氏名と性別を表示する
 */
public class Question11 {

	public static void main(String[] args) {

		//引数が２つあるか判定
		if(args.length == 2 ) {
			//男かどうか判定
			boolean isMan = isMan(args[1]);

			//判定結果で性別表示
			if(isMan == true) {
				//男性の表示
				System.out.println("氏名 : " + args[0] + ", 性別 : 男性");
			}else {
				//女性の表示
				System.out.println("氏名 : " + args[0] + ", 性別 : 女性");
			}

		//引数が２つない場合
		}else {
			//エラーメッセージを表示
			System.out.println("コマンドラインで、氏名と性別を引き渡してください。");
		}
	}

	/**
	 * 男か判定する
	 * @param isMan
	 * @return
	 */
	private static boolean isMan(String isMan) {

		//男か判定
		if(isMan.equals("M")) {
			return true;
		}


		return false;
	}

}
