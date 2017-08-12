package org.bianqi.demo.facade;
/**
 * 写信具体过程
 * <p>Title: LetterProcessImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月6日下午11:35:18
 * @version 1.0
 */
public class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("填写信的内容...." + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("填写收件人地址及姓名...." + address);
	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("把信放到信封中....");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件...");
	}

}
