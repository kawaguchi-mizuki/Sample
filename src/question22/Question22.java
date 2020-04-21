package question22;

public class Question22 {

	/**
	 * 課題２２
	 * 定数の宣言
	 * @param args
	 */
	public static void main(String[] args) {

		/**生徒クラスを宣言**/
		Student[] student = new Student[2];
		//メソッドを呼び出して格納
		student = getStudent();
		//生徒の情報を表示するメソッド呼び出し
		disp(student);

	}

	/**
	 * 生徒の情報を受け渡す
	 * @return
	 */
	private static Student[] getStudent() {

		/**生徒クラスを宣言**/
		Student[] student = new Student[2];

		//生徒の情報を格納
		student[0] = new Student("アルファ太郎",true,1);
		student[1] = new Student("ベータ花子",false,2);

		//値を返す
		return student;
	}

	/**
	 * 生徒の情報を表示
	 * @param student
	 */
	private static void disp(Student[] student) {

		//生徒の数だけループ
		for(int i = 0; i < student.length; i++) {
			//生徒の情報を表示
			System.out.println(student[i].toString());
		}


	}

}
