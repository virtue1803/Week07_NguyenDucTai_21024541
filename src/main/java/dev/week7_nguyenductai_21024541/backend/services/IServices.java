package dev.week7_nguyenductai_21024541.backend.services;

import java.util.List;
import java.util.Optional;

public interface IServices<T, ID> {
    void save(T t);
    void delete(ID id);
    List<T> findAll();
    Optional<T> findById(ID id);
}