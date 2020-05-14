package ru.pavellarionov93.springwebtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavellarionov93.springwebtask.entity.Order;
import ru.pavellarionov93.springwebtask.repository.OrdersRepository;


@Service
public class OrdersService {

    @Autowired
    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

    public void createOrder(Order order){
        ordersRepository.save(order);
    }
}
