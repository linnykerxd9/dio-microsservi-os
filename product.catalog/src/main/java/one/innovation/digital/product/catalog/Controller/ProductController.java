package one.innovation.digital.product.catalog.Controller;


import one.innovation.digital.product.catalog.Model.Product;
import one.innovation.digital.product.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){

        return productRepository.save(product);

    }

    @GetMapping("/catalog")
    Iterable<Product> findAllProductsCatalog(){
        return productRepository.findAll();
    }
    @GetMapping("/catalog/{id}")
    Optional<Product> findById(@PathVariable("id") Long id){
        return productRepository.findById(id);
    }

}
