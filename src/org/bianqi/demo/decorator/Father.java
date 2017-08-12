package org.bianqi.demo.decorator;

public class Father {
	public static void main(String[] args) {
		// SchoolReport sr = new FouthGradeSchoolReport();
//		SchoolReport sr = new SugarFouthGradeSchoolReport();
//		sr.report();
		SchoolReport sr;
		sr = new FouthGradeSchoolReport();
		sr = new HighScoreDecorator(sr);
		sr = new SortDecorator(sr);
		sr.report();
		sr.sign("老三");
	}
}
