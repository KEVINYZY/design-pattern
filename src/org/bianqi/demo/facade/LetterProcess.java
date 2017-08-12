package org.bianqi.demo.facade;

/**
 * 
 * <p>Title: LetterProcess</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月6日下午11:33:14
 * @version 1.0
 */
public interface LetterProcess {
	
	public void writeContext(String context);
	
	public void fillEnvelope(String address);
	
	public void letterInotoEnvelope();
	
	public void sendLetter();
	
}
