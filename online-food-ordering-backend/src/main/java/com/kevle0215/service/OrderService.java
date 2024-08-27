package com.kevle0215.service;

import java.util.List;

import com.kevle0215.model.Order;
import com.kevle0215.model.User;
import com.kevle0215.request.OrderRequest;

public interface OrderService {
    
    public Order createOrder(OrderRequest order, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus) throws Exception;

    public void cancelOrder(Long orderId) throws Exception;

    public List<Order> getUsersOrder(Long userId) throws Exception;

    public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus) throws Exception;

    public Order findOrderById(Long orderId) throws Exception;
}
