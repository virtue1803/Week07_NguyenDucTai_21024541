package dev.week7_nguyenductai_21024541.backend.services.implement;

import dev.week7_nguyenductai_21024541.backend.models.ProductPrice;
import dev.week7_nguyenductai_21024541.backend.models.ProductPriceId;
import dev.week7_nguyenductai_21024541.backend.repositories.ProductPriceRepository;
import dev.week7_nguyenductai_21024541.backend.services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductPriceService implements IServices<ProductPrice, ProductPriceId> {
    private ProductPriceRepository productPriceRepository;

    @Autowired
    public ProductPriceService(ProductPriceRepository productPriceRepository) {
        this.productPriceRepository = productPriceRepository;
    }

    @Override
    public void save(ProductPrice productPrice) {
        productPriceRepository.save(productPrice);
    }

    @Override
    public void delete(ProductPriceId productPriceId) {
        productPriceRepository.deleteById(productPriceId);
    }

    @Override
    public List<ProductPrice> findAll() {
        return productPriceRepository.findAll();
    }

    @Override
    public Optional<ProductPrice> findById(ProductPriceId productPriceId) {
        return productPriceRepository.findById(productPriceId);
    }
}
