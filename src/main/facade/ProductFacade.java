package src.main.facade;

import src.main.entity.Product;
import src.main.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFacade {

    private ProductService productService;

    public int addNewProduct(String name, String factory, Double price){
        Product product = new Product(name, factory, price);
        return this.productService.save(product);
    }

    public List<String> listProducts(){
        return productService.findAll().stream().map(lote -> lote.toString()).collect(Collectors.toList());
    }
}
