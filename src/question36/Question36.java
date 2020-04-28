package question36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question36 {

	/**
	 * 課題３６
	 * 応用
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		/**キーボード入力用のクラス**/
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		/**数値を格納するリスト**/
		List<Integer> numList = new ArrayList<Integer>();

		/**合計値**/
		int total = 0;

		//無限ループ
		while(true) {

			//例外処理
			try {

				//キーボード入力
				System.out.print("Input > ");
				//入力された数値をリストに格納
				numList.add(Integer.valueOf(br.readLine()));

			//数値以外が入力された場合
			} catch (NumberFormatException | IOException e) {

				//エラーメッセージを表示
				System.out.println("ERROR-入力値が数値以外です" + e);
				//ループに戻る
				continue;
			}

			//メッセージを表示
			System.out.println("足し算を続けますか？");
			System.out.print("続ける場合はyを、終了する場合はy以外を入力してください >");

			//足し算を続けるか判定
			if(!(br.readLine().equals("y"))){
				//ループから抜ける
				break;
			}

		}

		//リストの要素数だけループ
		for (int i = 0; i < numList.size(); i++) {

			//合計値加算
			total = total + numList.get(i);

			//リストの最後か判定
			if(i == numList.size()-1) {
				//メッセージを表示
				System.out.print(numList.get(i) + " = ");
			}else {
				//メッセージを表示
				System.out.print(numList.get(i) + " + ");
			}

		}

		//合計値を表示
		System.out.println(total);
	}

}
