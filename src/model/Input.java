package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	/**
	 * キーボード入力用メソッド
	 * @return
	 */
	public static String[] inputName() {

		/**キーボード入力用のクラス**/
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		/**社員名を格納**/
		String[] names = new String[4];

		//社員名を入力させる
		for (int i = 0; i < names.length; i++) {
			try {
				//キーボード入力
				System.out.print(i + 1);
				System.out.print( ":input name > ");
				names[i] = br.readLine();
			} catch (IOException e) {
				//エラーメッセージを表示
				System.out.println("エラー");
			}
		}
		return names;
	}


}
