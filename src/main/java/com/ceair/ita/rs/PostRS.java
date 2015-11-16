package com.ceair.ita.rs;

import java.io.Serializable;

public class PostRS implements Serializable{

	private static final long serialVersionUID = 2804093185067469376L;
	
	private int msgCode;
	private String msgInfo;
	private String result;
	
	public PostRS(){}
	
	public PostRS(int msgCode, String msgInfo, String result) {
		this.msgCode = msgCode;
		this.msgInfo = msgInfo;
		this.result = result;
	}
	
	public int getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgInfo() {
		return msgInfo;
	}
	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
