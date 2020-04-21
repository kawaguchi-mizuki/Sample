package question30;

import java.util.ArrayList;
import java.util.Collections;

import model.AbstractSalary;
import model.Employee;
import model.Fukuoka;
import model.Tokyo;

/**
 * 課題３０
 * 降順ソート
 */
public class Question30 {

	public static void main(String[] args) {

		/**リストを宣言**/
		ArrayList<String> list = new ArrayList<String>();

		/**社員クラスを宣言**/
		Employee[]  emp = new Employee[4];
		//メソッドを呼び出して格納
		emp = getEmployees();

		//社員の情報をリストに格納し表示するメソッド呼び出し
		disp(list,emp);

		//社員のデータを消すメソッド呼び出し
		list = delete(list,emp);

		//社員の情報をリストで表示するメソッド呼び出し
		disp2(list);

		//降順ソートのメソッド呼び出し
		sort(emp,list);

	}

	/**
	 * 降順にソート
	 * @param emp
	 * @param list
	 */
	private static void sort(Employee[] emp, ArrayList<String> list) {


		//降順ソート
		Collections.sort(list,Collections.reverseOrder());

		//メッセージを表示
		System.out.println("--現在登録されているデータ(降順）--");
		System.out.println(list.toString());

	}


	/**
	 * 社員情報の削除
	 * @param list
	 */
	private static void disp2(ArrayList<String> list) {

		//メッセージを表示
		System.out.println("--現在登録されているデータ--");
		System.out.println(list.toString());
		System.out.println();
	}

	/**
	 * リストの2番目を削除する
	 * @param list
	 * @param emp
	 * @return
	 */
	private static ArrayList<String> delete(ArrayList<String> list, Employee[] emp) {

		//メッセージを表示
		System.out.println("--２番目のデータは--");
		System.out.println(emp[2].toString());
		System.out.println("２番目のデータを削除しました。");
		System.out.println();

		//リストの２番目を削除
		list.remove(2);

		return list;

	}

	/**
	 * 社員の情報を表示
	 * @param list
	 * @param emp
	 */
	private static void disp(ArrayList<String> list, Employee[] emp) {

		//メッセージを表示
		System.out.println("--現在登録されているデータ--");

		//社員の数だけループ
		for(int i = 0; i < emp.length; i++) {
			//社員の情報をリストに格納
			list.add(emp[i].toString());
			//リストの中身表示

		}

		//メッセージを表示
		System.out.println(list.toString());
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
