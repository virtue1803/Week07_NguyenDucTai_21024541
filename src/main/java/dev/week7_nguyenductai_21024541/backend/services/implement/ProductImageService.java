package dev.week7_nguyenductai_21024541.backend.services.implement;

import dev.week7_nguyenductai_21024541.backend.models.ProductImage;
import dev.week7_nguyenductai_21024541.backend.repositories.ProductImageRepository;
import dev.week7_nguyenductai_21024541.backend.services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageService implements IServices<ProductImage, Long> {
    private final ProductImageRepository productImageRepository;
    @Autowired
    public ProductImageService(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }

    @Override
    public void save(ProductImage productImage) {
        productImageRepository.save(productImage);
    }

    @Override
    public void delete(Long id) {
        productImageRepository.deleteById(id);
    }

    @Override
    public List<ProductImage> findAll() {
        return productImageRepository.findAll();
    }

    @Override
    public Optional<ProductImage> findById(Long id) {
        return productImageRepository.findById(id);
    }
}