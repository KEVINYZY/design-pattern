package org.bianqi.demo.command;

/**
 * 
 * <p>Title: AddRequirementCommand</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:49:11
 * @version 1.0
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.rg.add();
		super.rg.plan();
	}

}
