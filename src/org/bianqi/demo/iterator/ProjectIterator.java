package org.bianqi.demo.iterator;

import java.util.ArrayList;
/**
 * 
 * <p>Title: ProjectIterator</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午8:20:10
 * @version 1.0
 */
public class ProjectIterator implements IProjectIterator {

	private ArrayList<IProject> projectList = new ArrayList<IProject>();

	private int currentItem = 0;

	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
			b = false;
		}
		return b;
	}

	@Override
	public IProject next() {
		return this.projectList.get(this.currentItem++);
	}
	
	public void remove(){
		
	}

}
