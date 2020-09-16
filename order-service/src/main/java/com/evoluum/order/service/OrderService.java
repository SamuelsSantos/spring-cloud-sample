package com.evoluum.order.service;

import com.evoluum.order.model.Order;
import com.evoluum.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        order.setCode( UUID.randomUUID().toString() );
        return orderRepository.save(order);
    }

    public Order findById(Integer id){
        return orderRepository.findById(id).orElse(null);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
