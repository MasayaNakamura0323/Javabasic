package practice10;

import java.util.Random;

public class Car {

	int serialNo;
	String color;
	int gasolin;

	int run() {
		// もう減らせない場合
		if (gasolin == 0) {
			return -1;
		}

		gasolin--;

		Random random = new Random();
		int distance = random.nextInt(15) + 1;
		return distance;



	}

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

}
