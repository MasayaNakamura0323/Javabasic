/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		ArrayList<Player> players = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String  line= scanner.nextLine();
				String[] array = line.split(",");

				Player p2 = new Player();

				p2.setPosition(array[0]);
				p2.setName(array[1]);
				p2.setCountry(array[2]);
				p2.setTeam(array[3]);



				players.add(p2);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください


		Collections.shuffle(players);

		int gk=0;
		int df=0;
		int mf=0;
		int fw=0;

		for(int i=0;i<players.size();i++) {
			if(players.get(i).getPosition().equals("GK")&&gk++<1) {

				System.out.println(players.get(i));

			}else if(players.get(i).getPosition().equals("DF")&&df++<4) {


				System.out.println(players.get(i));

			}else if(players.get(i).getPosition().equals("MF")&&mf++<4) {


				System.out.println(players.get(i));


			}else if(players.get(i).getPosition().equals("FW")&&fw++<2) {


				System.out.println(players.get(i));
			}else {

			}
		}

	}

}
