package question22;

/**
 * 生徒クラス
 *
 */
public class Student extends Personal {

	/**学籍番号の定数**/
	private static final int STUDENT_ID = 100000;
	/**登録開始番号**/
	private static int count = 1;
	/**学籍番号**/
	private Integer studentId;
	/**学年**/
	private Integer grade;

	/**
	 * コンストラクタ生成
	 * @param name
	 * @param isMan
	 */
	public Student(String name, boolean isMan, Integer grade) {
		super(name, isMan);

		//学籍番号を付与
		this.studentId = STUDENT_ID + count;
		this.grade = grade;

		//カウントを増やす
		count++;
	}

	@Override
	public String toString() {

		//メッセージを表示
		return "【" + studentId + "】" + grade + "年 " + super.toString();
	}




}
