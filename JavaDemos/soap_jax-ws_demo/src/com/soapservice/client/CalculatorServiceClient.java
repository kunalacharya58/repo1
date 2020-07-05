package com.soapservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soapservice.CalculatorService;

public class CalculatorServiceClient {

	public static void main(String[] args) {
		String endpoint = "http://localhost:9020/calci?wsdl";
		try {
			URL url = new URL(endpoint);
			QName qName = new QName("http://impl.soapservice.com/", "CalculatorServiceImplService");
			Service service = Service.create(url, qName);
			CalculatorService cs = service.getPort(CalculatorService.class);
			
			System.out.println(cs.sayHelloByName("Kunal"));
			System.out.println("Add service: "+cs.add(100, 200));
			System.out.println("Mul Service: "+cs.multiply(12, 5));
			System.out.println("Sub Service: "+cs.subtract(100, 60));
			System.out.println("Div Service: "+cs.divide(800, 40));
		
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
	}

}
