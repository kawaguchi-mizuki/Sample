package question16;

import calc.BmiCalc;

/**
 * 課題１６
 * 身長と体重、BMIを表示する。
 */
public class Question16 {

	public static void main(String[] args) {

		/**引数を格納**/
		Double height = Double.parseDouble(args[0]);
		Double weight = Double.parseDouble(args[1]);
		/**BMIの値を格納**/
		double bmi = 0;

		//dispに値を受け渡す
		disp(height,weight);

		//bmiの計算
		bmi = BmiCalc.getBmi(height, weight);

		//BMIを表示
		System.out.println("BMI : " + bmi);
	}

	/**
	 * 体重と慎重を表示
	 * @param height
	 * @param weight
	 */
	private static void disp(double height, double weight) {

		//身長と体重を表示
		System.out.println("身長 : " + height + "m 体重 : " + weight + "kg");
	}

}
