package question24;

import model.AbstractSalary;
import model.Employee;
import model.Fukuoka;
import model.Tokyo;

/**
 * 課題２４
 * インターフェース
 */
public class Question24 {

	public static void main(String[] args) {

		/**社員クラスを宣言**/
		Employee[]  emp = new Employee[2];
		//メソッドを呼び出して格納
		emp = getEmployees();
		//社員の情報を表示するメソッド呼び出し
		disp(emp);
	}

	/**
	 * 社員の情報を表示
	 * @param emp
	 */
	private static void disp(Employee[] emp) {

		//社員の数だけループ
		for(int i = 0; i < emp.length; i++) {
			//社員の情報を表示
			System.out.println(emp[i].toString());
		}
	}

	/**
	 * 社員の情報を受け渡す
	 * @return
	 */
	private static Employee[] getEmployees() {

		/**社員クラスを宣言**/
		Employee[]  emp = new Employee[2];

		/**地域クラスを宣言**/
		AbstractSalary tokyo = new Tokyo();
		AbstractSalary fukuoka = new Fukuoka();

		//社員情報を格納
		emp[0] = new Employee("アルファ太郎", true,tokyo);
		emp[1] = new Employee("ベータ花子", false,fukuoka);

		//値を返す
		return emp;
	}

}
