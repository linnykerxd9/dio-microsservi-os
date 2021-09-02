package one.innovation.digital.product.catalog.repository;

import one.innovation.digital.product.catalog.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
