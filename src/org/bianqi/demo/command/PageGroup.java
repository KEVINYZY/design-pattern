package org.bianqi.demo.command;
/**
 * 
 * <p>Title: PageGroup</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:42:35
 * @version 1.0
 */
public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工组...");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一个页面...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面...");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一个页面...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求页面变更计划...");
	}

}
