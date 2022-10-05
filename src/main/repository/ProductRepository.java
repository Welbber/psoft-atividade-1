package src.main.repository;

import src.main.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> listProduct;

    private static ProductRepository repository;

    private ProductRepository() {
        this.listProduct = new ArrayList<>();
    }

    public static ProductRepository getInstance(){
        if(repository == null)
            repository = new ProductRepository();
        return repository;
    }

    public Integer save(Product product){
        this.listProduct.add(product);
        return listProduct.size();
    }

    public List<Product> findAll(){
        return this.listProduct;
    }

    public Product findById(Integer id){
        try{
            return this.listProduct.get(id);
        }catch (NullPointerException e){
            // evoluir posteriormente tratamento
            System.err.println("Produto não encontrado");
            return null;
        }
    }
}