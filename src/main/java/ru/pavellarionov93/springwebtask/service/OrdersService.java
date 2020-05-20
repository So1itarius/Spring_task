package ru.pavellarionov93.springwebtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pavellarionov93.springwebtask.entity.Order;
import ru.pavellarionov93.springwebtask.repository.OrdersRepository;

import java.util.List;


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
    public void deleteOrder(Long id){
        ordersRepository.deleteById(id);
    }
    @Transactional
    public void updateOrder(Long id, String title){
        ordersRepository.updateValue(id,title);
    }

    public List<Order> getAll() {
        return ordersRepository.getAll();
    }
}
