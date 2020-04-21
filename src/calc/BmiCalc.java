package calc;

/**
 * 課題１６
 * BMIを計算するクラス
 */
public class BmiCalc {

	public static Double getBmi(Double height,Double weight) {

		if(height == null || weight == null) {
			return null;
		}
		double result = weight / (height * height);
		return result;
	}

}
