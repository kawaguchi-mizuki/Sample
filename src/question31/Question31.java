package question31;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import model.AbstractSalary;
import model.Employee;
import model.Fukuoka;
import model.Tokyo;

/**
 * 課題３１
 * ハッシュマップ、昇順ソート
 */
public class Question31 {

	public static void main(String[] args) {


		/**社員クラスを宣言**/
		Employee[]  emp = new Employee[4];

		/**ハッシュマップ生成**/
		Map<Integer, String> hash = new HashMap<Integer, String>();

		//メソッドを呼び出して格納
		emp = getEmployees();

		//社員の情報をリストに格納し表示するメソッド呼び出し
		disp(hash,emp);

		//社員のデータを消すメソッド呼び出し
		hash = delete(hash,emp);

		//社員の情報をリストで表示するメソッド呼び出し
		disp2(hash);

		//昇順ソートのメソッド呼び出し
		sort(emp,hash);

	}

	/**
	 * 昇順にソート
	 * @param emp
	 * @param hash
	 */
	private static void sort(Employee[] emp, Map<Integer, String> hash) {

		//キーの昇順にソート
		Map<Integer, String> mMap = new TreeMap<Integer, String>(hash);

		//メッセージを表示
		System.out.println("--現在登録されているデータ(番号（キー）順 --");
		System.out.println(mMap.toString());

	}


	/**
	 * 社員情報の表示
	 * @param hash
	 */
	private static void disp2(Map<Integer, String> hash) {

		//メッセージを表示
		System.out.println("--現在登録されているデータ--");
		System.out.println(hash.toString());
		System.out.println();
	}

	/**
	 * リストの４番目を削除する
	 * @param hash
	 * @param emp
	 * @return
	 */
	private static Map<Integer, String> delete(Map<Integer, String> hash, Employee[] emp) {

		//メッセージを表示
		System.out.println("--" + emp[3].getEmpId() +"のデータは--");
		System.out.println(emp[3].toString());
		System.out.println(emp[3].getEmpId() + "のデータを削除しました。");
		System.out.println();

		//リストの4番目を削除
		hash.remove(emp[3].getEmpId());

		return hash;

	}

	/**
	 * 社員の情報を表示
	 * @param hash
	 * @param emp
	 */
	private static void disp(Map<Integer, String> hash, Employee[] emp) {

		/**キーを格納**/
		int number = 100001;

		//メッセージを表示
		System.out.println("--現在登録されているデータ--");

		//社員の数だけループ
		for(int i = 0; i < emp.length; i++) {
			//社員の情報をリストに格納
			hash.put(number,emp[i].toString());
			//キーの数値を増加
			number++;
		}

		//メッセージを表示
		System.out.println(hash.toString());
		System.out.println();
	}

	/**
	 * 社員の情報を受け渡す
	 * @return
	 */
	private static Employee[] getEmployees() {

		/**社員クラスを宣言**/
		Employee[]  emp = new Employee[4];

		/**地域クラスを宣言**/
		AbstractSalary tokyo = new Tokyo();
		AbstractSalary fukuoka = new Fukuoka();

		//社員情報を格納
		emp[0] = new Employee("アルファ太郎", true,tokyo);
		emp[1] = new Employee("ベータ花子", false,fukuoka);
		emp[2] = new Employee("ガンマ次郎", true,fukuoka);
		emp[3] = new Employee("デルタ三郎", true,tokyo);

		//値を返す
		return emp;
	}

}
