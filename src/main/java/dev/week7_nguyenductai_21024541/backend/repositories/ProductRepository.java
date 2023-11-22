package dev.week7_nguyenductai_21024541.backend.repositories;

import dev.week7_nguyenductai_21024541.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
