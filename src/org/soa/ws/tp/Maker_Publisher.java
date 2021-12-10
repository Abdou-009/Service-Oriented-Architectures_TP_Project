package org.soa.ws.tp;

import javax.xml.ws.Endpoint;



public class Maker_Publisher {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/Maker", new MakerImpl());
		
		

	}

}
