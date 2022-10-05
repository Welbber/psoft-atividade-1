package src.main.service;

import src.main.entity.Product;
import src.main.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private ProductRepository productRepository;

    public ProductService(){
        this.productRepository = ProductRepository.getInstance();
    }

    public List<Product> findAll(){
        return this.productRepository.findAll();
    }

    public int save(Product product){
        return this.productRepository.save(product);
    }

    public Product findById(Integer id){
        return this.productRepository.findById(id);
    }
}
