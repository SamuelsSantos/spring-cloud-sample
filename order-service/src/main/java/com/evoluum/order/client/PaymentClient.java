package com.evoluum.order.client;


import org.springframework.data.repository.query.Param;

public interface PaymentClient {
	String checkStatus(@Param("orderCode") String orderCode);
}
