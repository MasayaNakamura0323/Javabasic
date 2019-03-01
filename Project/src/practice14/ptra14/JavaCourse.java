package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course {

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		return "【Eラーニング】Java";
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String []array= {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return array;
	}



}
