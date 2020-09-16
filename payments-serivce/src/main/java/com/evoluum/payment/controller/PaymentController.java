package com.evoluum.payment.controller;

import com.evoluum.payment.model.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoluum.payment.dto.PaymentDataDTO;

@RestController
@RequestMapping("payments")
public class PaymentController {

	@PostMapping
	public void save(@RequestBody Payment payment){

	}

	@PutMapping("/{id}")
	public void pay(@RequestBody PaymentDataDTO paymentDataDTO){

	}
}
