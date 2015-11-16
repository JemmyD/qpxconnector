package com.ceair.ita.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Inputs {

	/*
	 * <search api="shopping" name="priceByItinerary" key="0QlI1ca1vcwIM0RQaNL1tK" version="6">
	  <inputs>    
	   <searchControl>
	     <slice>       
	       <origin>SHA</origin>       
	        <destination>TYO</destination>
	        <date>2015-10-27</date>
	     </slice>
	     <passenger>
	       <type>adult</type>
	       <count>1</count>
	     </passenger>
	   </searchControl>
	 </inputs>
	 <summarizer>priceByItineraryTrip</summarizer>
	 <summarizer>pricingDetail</summarizer>
	 <summarizer>itineraryDetail</summarizer>
	</search>
	 */
	@XStreamAlias("searchControl")
	public SearchControl searchControl;
	
	public Inputs(){}
	public Inputs(SearchControl searchControl){
		this.searchControl = searchControl;
	}

}
