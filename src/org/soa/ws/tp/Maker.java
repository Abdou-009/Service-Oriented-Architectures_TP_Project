package org.soa.ws.tp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



@WebService(name="MultiServise")
public interface Maker {
	
	@WebMethod(operationName="getMaxValue")
	@WebResult(name="Max")
	public double getMaxValue(@WebParam(name="val_1")double a,@WebParam(name="val_2") double b);
	
	@WebMethod(operationName="getMinValue")
	@WebResult(name="Min")
	public double getMinValue(@WebParam(name="val_1")double a,@WebParam(name="val_2") double b);
	
	@WebMethod(operationName="getMoyValue")
	@WebResult(name="Moy") 
	public double Moy(@WebParam(name="val_1")double a,@WebParam(name="val_2") double b,@WebParam(name="val_3")double c,@WebParam(name="val_4") double d);
	
	
	@WebMethod(operationName="toUpperString")
	@WebResult(name="toUpper")
	public String toUpperString(@WebParam(name="Lower")String  s);
	
	@WebMethod(operationName="toLowerString")
	@WebResult(name="toLower")
	public String toLowerString(@WebParam(name="Upper")String  s);
	
		
}
