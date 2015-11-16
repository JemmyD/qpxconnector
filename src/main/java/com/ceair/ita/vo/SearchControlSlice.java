package com.ceair.ita.vo;


public class SearchControlSlice {

	/*
	 * <slice>
	    <maxStopCount>1</maxStopCount>
        <origin>SHA</origin>       
        <destination>TYO</destination>
        <date>2015-10-27</date>
     </slice>
	 */
	public String maxStopCount;
	public String origin;
	public String destination;
	public String date;
	
	public SearchControlSlice(){}
	
	public SearchControlSlice(String origin, String destination, String date, String maxStopCount) {
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		if(maxStopCount == null){
			this.maxStopCount=null;
		}else{
			this.maxStopCount=maxStopCount;
		}
	}

}
