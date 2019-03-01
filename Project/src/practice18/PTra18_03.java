/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


		// ★ 削除後のArrayListの中身を全件出力してください


		ArrayList<Player> players = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String  line= scanner.nextLine();
				String[] array = line.split(",");

				Player p = new Player();

				p.setPosition(array[0]);
				p.setName(array[1]);
				p.setCountry(array[2]);
				p.setTeam(array[3]);



				players.add(p);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		for(int i=0;i<players.size();i++) {
			if(players.get(i).getTeam().equals("レアル・マドリード") || players.get(i).getTeam().equals("バルセロナ")) {
				players.remove(i);

			}else {


				System.out.println(players.get(i));

			}

			

		}





	}
}
