package org.soa.ws.tp;

import javax.jws.WebMethod;
import javax.jws.WebService;






@WebService(endpointInterface="org.soa.ws.tp.Maker")
public class MakerImpl implements Maker {
	
	
	@WebMethod
	public double getMaxValue(double a, double b){
		return Math.max(a, b);
		
	}
	@WebMethod
	public double getMinValue(double a, double b){
		return Math.min(a, b);
		
	}
	
	@WebMethod
	public double Moy(double a, double b, double c, double d){
		return (a+b+c+d)/4;}
	
	
	@WebMethod
	public String toUpperString(String s){
		return s.toUpperCase();
		
	}
	public String toLowerString(String s){
		return s.toLowerCase();
		
	}

}
