public interface IServices<T, ID> {
    void save(T t);
    void delete(ID id);
    List<T> findAll();
    Optional<T> findById(ID id);
}