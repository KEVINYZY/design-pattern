package org.bianqi.demo.proxy;

public class XiMenQing {
	public static void main(String[] args) {
//		WangPo wangPo = new WangPo();
//		wangPo.makeEyesWithMan();
//		wangPo.happyWithMan();
	
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo = new WangPo(jiaShi);
		
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}
