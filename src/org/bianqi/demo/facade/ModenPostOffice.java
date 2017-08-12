package org.bianqi.demo.facade;

public class ModenPostOffice {
	private LetterProcess letterProcess = new LetterProcessImpl();

	public void sendLetter(String context,String address){
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();
	}


}
