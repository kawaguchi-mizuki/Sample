package question34;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 書き込み用ファイル
 *
 */
public class Write {

	/**
	 * ファイル出力
	 * @param list
	 * @throws Exception
	 */
	static  void print(ArrayList<String> list) throws Exception {

		//FileOutputStreamクラスのオブジェクトを生成する
		FileOutputStream fos = new FileOutputStream("C:\\Users\\81702\\Desktop\\employeeList2.csv");
		OutputStreamWriter  osw = null;

		//エンコード
		osw = new OutputStreamWriter(fos,"Shift-JIS");
		BufferedWriter bw = new BufferedWriter(osw);

		//属性名を格納
		bw.write("id");
		bw.write(",");
		bw.write("name");
		bw.write(",");
		bw.write("sexuality");
		bw.write(",");
		bw.write("salary");
		bw.write(",");
		bw.newLine();

		//リストの中身を格納
		for(String result : list) {

			//ID部分を切り取り格納
			bw.write(result.substring(result.indexOf("【") + 1,result.indexOf("】")));
			bw.write(",");
			//名前部分を切り取り格納
			bw.write(result.substring(result.indexOf("】") + 1,result.indexOf("(")));
			bw.write(",");
			//性別部分を切り取り格納
			bw.write(result.substring(result.indexOf("(") + 1,result.indexOf(")")));
			bw.write(",");
			//給料部分を切り取り格納
			bw.write(result.substring(result.indexOf("\\") ,result.indexOf("-")));
			bw.write(",");
			//改行
			bw.newLine();

		}

		//ファイルに書き込む
		bw.flush();

		//ファイルをクローズする
		bw.close();

		//メッセージを表示
		System.out.println("********** FILE 作成 **********");

	}

}
