package org.bianqi.demo.bridge;

/**
 * 
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日下午7:47:01
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("-----------------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("\n");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		shanZhaiCorp.makeMoney();
	}

}
