package com.sample.order;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.Order;
import sample.OrderProcessingService;
import sample.holders.OrderHolder;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
@RefreshScope

public class OrderController {
	@Autowired
	OrderProcessingService port;

	@RequestMapping(method = POST)

	public String getData(@RequestBody Order order) throws RemoteException {
		OrderHolder o = new OrderHolder();
		o.setValue(order);
		return port.processOrder(order.getOrderID(), o);
	}

}
