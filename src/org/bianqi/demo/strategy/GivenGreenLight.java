package org.bianqi.demo.strategy;

public class GivenGreenLight implements IStrategy{

	@Override
	public void opterate() {
		System.out.println("求吴国太开个绿灯,放行！");
	}

}
