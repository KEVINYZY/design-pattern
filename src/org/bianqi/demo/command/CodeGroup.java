package org.bianqi.demo.command;
/**
 * 
 * <p>Title: CodeGroup</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:43:11
 * @version 1.0
 */
public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到代码组...");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一项功能...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一项功能...");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一项功能...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求代码变更计划...");
	}

}
