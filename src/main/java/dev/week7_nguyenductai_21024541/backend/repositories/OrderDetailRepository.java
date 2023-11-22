package dev.week7_nguyenductai_21024541.backend.repositories;

import dev.week7_nguyenductai_21024541.backend.models.OrderDetail;
import dev.week7_nguyenductai_21024541.backend.models.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}
