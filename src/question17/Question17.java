package question17;

import calc.BmiCalc;

/**
 * 課題１７
 * 例外処理の記述
 */
public class Question17 {

	public static void main(String[] args) {


		/**身長と体重を格納**/
		Double height;
		Double weight;
		/**BMIの値を格納**/
		double bmi = 0;

		try {
			/**引数を身長と体重に格納**/
			height = Double.parseDouble(args[0]);
			weight = Double.parseDouble(args[1]);

			//dispに値を受け渡す
			disp(height,weight);

			//bmiの計算
			bmi = BmiCalc.getBmi(height, weight);
			//BMIを表示
			System.out.println("BMI : " + bmi);


		} catch (NumberFormatException e) {

			System.out.println("2つの数値を入力してください。");
		}


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
