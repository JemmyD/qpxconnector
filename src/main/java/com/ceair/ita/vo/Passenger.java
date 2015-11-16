package com.ceair.ita.vo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Passenger {

	/*
	 * <passenger>
       <type>adult</type>
       <count>1</count>
     </passenger>
	 */
	@XStreamAsAttribute
	public String id;
	public String ptc;
	public String type;
	public int count;
	
	public Passenger(){}
	public Passenger(String type, int count){
		this.type = type;
		this.count = count;
	}

}
