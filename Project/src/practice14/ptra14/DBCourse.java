package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course {

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		return "「【Eラーニング】DB基礎」";
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String []array= {"DB基礎","SQL基礎","正規化","SQL応用"};
		return array;
	}

}
