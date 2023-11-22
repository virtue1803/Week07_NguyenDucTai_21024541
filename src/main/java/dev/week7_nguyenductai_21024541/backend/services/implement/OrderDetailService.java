package dev.week7_nguyenductai_21024541.backend.services.implement;

import dev.week7_nguyenductai_21024541.backend.models.OrderDetail;
import dev.week7_nguyenductai_21024541.backend.models.OrderDetailId;
import dev.week7_nguyenductai_21024541.backend.repositories.OrderDetailRepository;
import dev.week7_nguyenductai_21024541.backend.services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailService implements IServices<OrderDetail, OrderDetailId> {
    private final OrderDetailRepository orderDetailRepository;
    @Autowired
    public OrderDetailService(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(OrderDetailId orderDetailId) {
        orderDetailRepository.deleteById(orderDetailId);
    }

    @Override
    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public Optional<OrderDetail> findById(OrderDetailId orderDetailId) {
        return orderDetailRepository.findById(orderDetailId);
    }
}
