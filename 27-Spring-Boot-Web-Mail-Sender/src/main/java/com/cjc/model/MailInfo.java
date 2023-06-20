package com.cjc.model;

public class MailInfo {

	private String from = "pravinnagpure633@gmail.com";
	private String to;
	private String sub;
	private String msg;
	private String cc;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "MailInfo [from=" + from + ", to=" + to + ", sub=" + sub + ", msg=" + msg + ", cc=" + cc + "]";
	}

	

	
}
