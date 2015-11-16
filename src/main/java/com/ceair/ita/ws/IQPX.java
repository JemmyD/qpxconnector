package com.ceair.ita.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ceair.ita.rq.PostRQ;
import com.ceair.ita.rs.PostRS;

@WebService
public interface IQPX {

	@WebMethod
	@WebResult
	public PostRS post(@WebParam PostRQ rq);
}