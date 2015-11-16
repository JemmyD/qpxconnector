package com.ceair.ita.vo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class SearchControl {
	@XStreamAlias("salesCountry")
	public String salesCountry;
	@XStreamImplicit(itemFieldName="slice")
	public List<SearchControlSlice> searchControlSlice = new ArrayList<SearchControlSlice>();
	@XStreamImplicit(itemFieldName="passenger")
	public List<Passenger> passengers = new ArrayList<Passenger>();
	
	public void addSearchControlSlice(SearchControlSlice searchControlSlice){
		this.searchControlSlice.add(searchControlSlice);
	}
	
	public void addPassenger(Passenger passenger){
		this.passengers.add(passenger);
	}

}
