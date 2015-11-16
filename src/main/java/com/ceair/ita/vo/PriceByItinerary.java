package com.ceair.ita.vo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("search")
public class PriceByItinerary {
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
	@XStreamAsAttribute
	public String api;
	@XStreamAsAttribute
	public String name;
	@XStreamAsAttribute
	public String key;
	@XStreamAsAttribute
	public String version;
	@XStreamAlias("inputs")
	public Inputs inputs;
	@XStreamImplicit(itemFieldName="summarizer")
	public List<String> summarizers = new ArrayList<String>();
	
	public PriceByItinerary(){}
	
	public PriceByItinerary(String api, String name, String key, String version){
		this.api = api;
		this.name = name;
		this.key = key;
		this.version = version;
	}
	
	public void addSummarizer(String summarizer){
		this.summarizers.add(summarizer);
	}
	
}
