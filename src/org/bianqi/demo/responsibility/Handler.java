package org.bianqi.demo.responsibility;

public abstract class Handler {
	private int level = 0;

	private Handler nextHandler;

	public Handler(int _level) {
		this.level = _level;
	}

	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(women);
			} else {
				System.out.println("没有请示的地方了 不做处理了");
			}
		}
	}
	
	public void setNext(Handler _handler){
		this.nextHandler = _handler;
	}
	public abstract void response(IWomen women);
}
