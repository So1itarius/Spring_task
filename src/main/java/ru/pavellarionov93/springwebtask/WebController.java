package ru.pavellarionov93.springwebtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pavellarionov93.springwebtask.entity.Order;
import ru.pavellarionov93.springwebtask.service.OrdersService;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private OrdersService orderService;

    @RequestMapping(value = "/new-order", method = RequestMethod.GET)
    public String OrderPage(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList", orders);
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
    @RequestMapping(value = "/del-order", method = RequestMethod.POST)
    public String delOrder(@RequestParam(value = "delete") Long id) {
        orderService.deleteOrder(id);
        return "redirect:/new-order";
    }
    @RequestMapping(value = "/upd-order", method = RequestMethod.POST)
    public String updOrder(@RequestParam(value = "id") Long id,@RequestParam(value = "new_value") String new_value) {
        orderService.updateOrder(id,new_value);
        return "redirect:/new-order";
    }

}