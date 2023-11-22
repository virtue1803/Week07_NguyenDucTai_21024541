package dev.week7_nguyenductai_21024541.backend.repositories;

import dev.week7_nguyenductai_21024541.backend.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
