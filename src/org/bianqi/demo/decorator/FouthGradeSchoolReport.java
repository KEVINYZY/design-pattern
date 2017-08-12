package org.bianqi.demo.decorator;

/**
 * 
 * <p>Title: FouthGradeSchoolReport</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:57:40
 * @version 1.0
 */
public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("尊敬的XXX家长:");
		System.out.println(" ......");
		System.out.println(" 语文 62 数学65 体育 98 自然 63");
		System.out.println(" .......");
		System.out.println(" 家长签名： ");
	}

	@Override
	public void sign(String name) {
		System.out.println("家长签名为："+name);
	}

}
