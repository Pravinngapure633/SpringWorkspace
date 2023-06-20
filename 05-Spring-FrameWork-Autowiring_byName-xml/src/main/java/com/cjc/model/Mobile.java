package com.cjc.model;

public class Mobile {

	private Jio jio;

	public Jio getJio() {
		return jio;
	}

	public void setJio(Jio jio) {
		this.jio = jio;
	}
	
	public Mobile() {
		System.out.println("Mobile :: Const");
	}
	
	public void dail() {
		System.out.println("Dailing.....");
		if(jio!=null)
		{
			jio.jioCall();
		}
		else {
			System.out.println("No-Network");
		}
	}
}
