package org.bianqi.demo.adapter;

import java.util.Map;

/**
 * 
 * <p>Title: OuterUserInfo</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月6日下午11:53:12
 * @version 1.0
 */
@SuppressWarnings("all")
public class OuterUserInfo extends OuterUser implements IUserInfo {
	
	private Map baseInfo = super.getUserBaseInfo(); //员工的基本信息
	private Map homeInfo = super.getUserHomeInfo(); //员工的家庭 信息
	private Map officeInfo = super.getUserOfficeInfo(); //工作信息
	
	@Override
	public String getUserName() {
		
		return null;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = (String)this.homeInfo.get("homeAddress");
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		
		return null;
	}

	@Override
	public String getJobPosition() {
		
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
