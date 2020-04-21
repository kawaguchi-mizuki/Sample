package question33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 課題３３
 * ファイルの書き込み
 */
public class Question33 {

	public static void main(String[] args) {

		/**社員の情報を格納**/
		int[][] employeeList = {

				{100001,26,200000},
				{100002,33,250000},
				{100003,50,300000}

		};



		try {
			//メッセージを表示
			System.out.println("**********FILE 作成開始**********");

			// 出力ファイルの作成
			FileWriter f = new FileWriter("C:\\Users\\81702\\Desktop\\employeeList.csv", false);
			PrintWriter p = new PrintWriter(new BufferedWriter(f));

			// ヘッダーを指定する
			p.print("employeeId");
			p.print(",");
			p.print("age");
			p.print(",");
			p.print("salary");
			p.println();

			// 内容をセットする
			for (int i = 0; i < employeeList.length; i++) {
				p.print(employeeList[i][0]);
				p.print(",");
				p.print(employeeList[i][1]);
				p.print(",");
				p.print(employeeList[i][2]);
				p.println();
			}

			// ファイルに書き出し閉じる
			p.close();

			//メッセージを表示
			System.out.println("**********FILE 作成終了**********");
		} catch (Exception e) {
		}



	}

}
