package com.sample.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxrpc.JaxRpcPortProxyFactoryBean;
import org.springframework.stereotype.Component;

import sample.OrderProcessingService;

@Component
@Configuration

public class AppConfig {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${order.wsdl.name}")
	String wsdlName;
	@Value("${order.namespace.uri}")
	String nameSpaceUri;
	@Value("${order.service.name}")
	String serviceName;
	@Value("${order.port.name}")
	String portName;
	@Value("${order.endPoint}")
	String endPoint;


	@Bean
	JaxRpcPortProxyFactoryBean jaxRpcPortProxy(){
		logger.info("Bean being created");
		JaxRpcPortProxyFactoryBean bean = new JaxRpcPortProxyFactoryBean();
		bean.setServiceInterface(OrderProcessingService.class);
		bean.setWsdlDocumentUrl(this.getClass().getResource(wsdlName));
		bean.setNamespaceUri(nameSpaceUri);
		bean.setServiceName(serviceName);
		bean.setPortName(portName);
		bean.setEndpointAddress(endPoint);
		return bean;
	}
	
}
