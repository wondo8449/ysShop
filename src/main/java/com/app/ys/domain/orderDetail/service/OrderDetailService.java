package com.app.ys.domain.orderDetail.service;

import com.app.ys.domain.order.repository.OrderRepository;
import com.app.ys.domain.orderDetail.repository.OrderDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

}
