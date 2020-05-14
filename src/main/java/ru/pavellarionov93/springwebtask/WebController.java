package ru.pavellarionov93.springwebtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pavellarionov93.springwebtask.entity.Order;
import ru.pavellarionov93.springwebtask.service.OrdersService;

@Controller
public class WebController {

    @Autowired
    private OrdersService orderService;

    @RequestMapping(value = "/new-order", method = RequestMethod.GET)
    public String addNewOrderPage() {
        return "NewOrder";
    }

    @RequestMapping(value = "/new-order", method = RequestMethod.POST)
    public String addNewOrder(@RequestParam(value = "title") String title, @RequestParam(value = "price") Double price) {
        Order order = new Order();
        order.setTitle(title);
        order.setPrice(price);
        orderService.createOrder(order);
        return "redirect:/new-order";
    }

}