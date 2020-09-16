package com.evoluum.payment.repository;

import com.evoluum.payment.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository  extends CrudRepository<Payment, Integer> {

}
