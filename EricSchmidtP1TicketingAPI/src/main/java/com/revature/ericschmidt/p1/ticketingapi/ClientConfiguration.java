package com.revature.ericschmidt.p1.ticketingapi;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.revature.ericschmidt.p1.ticketingapi.service.EventService;

@Configuration
public class ClientConfiguration {

	@Bean
	public JaxWsPortProxyFactoryBean serviceProxy() {
		JaxWsPortProxyFactoryBean proxyFactory = new JaxWsPortProxyFactoryBean();

		try {
			proxyFactory.setWsdlDocumentUrl(new URL("http://localhost:8081/soap-service/event-service?wsdl"));
			proxyFactory.setServiceInterface(EventService.class);
			proxyFactory.setServiceName("EventServiceImplService");
			proxyFactory.setPortName("EventServiceImplPort");
			proxyFactory.setNamespaceUri("http://service.eventapi.p1.ericschmidt.revature.com/");
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		return proxyFactory;
	}
	
}
