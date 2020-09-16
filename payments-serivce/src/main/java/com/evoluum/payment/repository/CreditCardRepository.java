package com.evoluum.payment.repository;

import org.springframework.data.repository.CrudRepository;

import com.evoluum.payment.model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {

}
