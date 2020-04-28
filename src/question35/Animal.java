package question35;

import java.util.ArrayList;
import java.util.List;

/**
 * 動物クラス
 *
 */
public class Animal {

	/**番号と名前を格納**/
	private int number;
	private String name;
	/**リストを宣言**/
	static List<String> fishList = new ArrayList<String>();

	/**
	 * コンストラクタ生成
	 * @param number
	 * @param name
	 */
	public Animal(int number, String name) {
		this.number = number;
		this.name = name;
		fishList.add(number + " : " + this.name);

	}

	/**
	 *
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return  fishList.toString() ;
	}





}
