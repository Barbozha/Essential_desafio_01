package com.devsuperior.desafio01.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio01.entities.Order;

@Service
public class ShippingService {
	public double shipment(Order order) {
		double valor;
		if(order.getBasic() < 100.00) {
			valor = 20.00;
		}else if(order.getBasic() >= 100.00 && order.getBasic() < 200.00 ) {
			valor = 12.00;
		}else {
			valor = 0.00;
		}
		return valor;
	}
}
