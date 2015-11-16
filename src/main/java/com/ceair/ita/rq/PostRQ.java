package com.ceair.ita.rq;

import java.io.Serializable;

import com.ceair.ita.vo.PriceByItinerary;


public class PostRQ implements Serializable {

	private static final long serialVersionUID = -2345976588560117613L;

	private PriceByItinerary pi;

	public PriceByItinerary getPi() {
		return pi;
	}

	public void setPi(PriceByItinerary pi) {
		this.pi = pi;
	}
	
	
}
