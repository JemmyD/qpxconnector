package com.ceair.ita.ws;

import com.ceair.ita.rq.PostRQ;
import com.ceair.ita.rs.PostRS;
import com.ceair.ita.util.PostClient;
import com.ceair.ita.vo.PriceByItinerary;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class QPX implements IQPX {

	public PostRS post(PostRQ rq) {
		int msgCode = 0;
		String msgInfo = null;
		String result = null;
		
		try{
			result = PostClient.postRQ(processQueryOfPriceByItinerary(rq.getPi()));
			msgCode = 1;
			msgInfo = "success";
		}catch(Exception e){
			msgCode = 0;
			msgInfo="failed,error="+e.getMessage();
		}
		return new PostRS(msgCode,msgInfo,result);
	}

	private String processQueryOfPriceByItinerary(PriceByItinerary search){
		XStream xstream = new XStream(new DomDriver());  
		xstream.processAnnotations(PriceByItinerary.class);
		String strXML = xstream.toXML(search);
		return strXML;
	}
}
