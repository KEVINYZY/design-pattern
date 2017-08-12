package org.bianqi.demo.decorator;

/**
 * 继承 VS 装饰者设计模式
 * <p>Title: SugarFouthGradeSchoolReport</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午8:01:54
 * @version 1.0
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

	private void reportHighScore() {
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}

	private void reportSort() {
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
}
