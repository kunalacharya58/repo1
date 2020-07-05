package com.soapservice.publisher;

import javax.xml.ws.Endpoint;

import com.soapservice.impl.CalculatorServiceImpl;

public class Publisher {

	public static void main(String[] args) {
		String url = "http://localhost:9020/calci";
		
		Endpoint.publish(url, new CalculatorServiceImpl());
		
		System.out.println("Your SOAP Service is published at "+url+"?wsdl");
		System.out.println("Open any of your favourite browser and check out the wsdl contract.");
		
	}

}
