package src.main.facade;

import src.main.entity.Lote;
import src.main.entity.Product;
import src.main.service.LoteService;
import src.main.service.ProductService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LoteFacade {

    private LoteService loteService;

    private ProductService productService;

    public int addLote(Integer amount, LocalDate dateV, int idProduct){
        Product product = productService.findById(idProduct);
        Lote lote = new Lote(amount, dateV, product);
        return loteService.save(lote);
    }

    public List<String> listLotes(){
        return loteService.findAll().stream().map(lote -> lote.toString()).collect(Collectors.toList());
    }
}
