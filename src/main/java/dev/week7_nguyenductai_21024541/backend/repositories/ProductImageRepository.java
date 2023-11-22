package dev.week7_nguyenductai_21024541.backend.repositories;

import dev.week7_nguyenductai_21024541.backend.models.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}
