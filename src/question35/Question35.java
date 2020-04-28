package question35;

import java.util.ArrayList;
import java.util.List;

/**
 * 課題３５
 * List応用
 */
public class Question35 {

	public static void main(String[] args) {

		/**魚のリスト**/
		List<String> fishList = new ArrayList<String>() {

			{
				add("アジ");
				add("イワシ");
				add("タイ");
				add("ブリ");
				add("マグロ");

			}

		};

		/**鳥のリスト**/
		List<String> birdList = new ArrayList<String>() {

			{
				add("アヒル");
				add("ウグイス");
				add("ツバメ");
				add("トキ");

			}

		};

		AnimalRegister fish = null;

		AnimalRegister bird = null;


		//リストの数だけループ
		for (int i = 0; i < fishList.size(); i++) {

			fish = new AnimalRegister(i + 1,fishList.get(i), "魚");

		}

		//メッセージを表示
		System.out.println(fish.toString());

		//リスト初期化
		Animal.fishList.clear();

		//リストの数だけループ
		for (int i = 0; i < birdList.size(); i++) {

			bird = new AnimalRegister(i + 1,birdList.get(i), "鳥");

		}

		//メッセージを表示
		System.out.println(bird.toString());


	}

}
