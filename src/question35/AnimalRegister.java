package question35;

/**
 * 動物登録クラス
 *
 */
public class AnimalRegister extends Animal {

	/**グループ名を格納**/
	private String groupName;

	/**
	 * コンストラクタ生成
	 * @param number
	 * @param name
	 * @param groupName
	 */
	public AnimalRegister(int number,String name,String groupName) {
		super(number, name);
		this.groupName = groupName;
	}

	/**
	 *
	 * @return
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return this.groupName + super.toString();
	}

}
