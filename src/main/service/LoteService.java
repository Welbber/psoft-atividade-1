package src.main.service;

import src.main.entity.Lote;
import src.main.entity.Product;
import src.main.repository.LoteRepository;

import java.util.List;

public class LoteService {

    private LoteRepository loteRepository;

    public LoteService(){
        this.loteRepository = LoteRepository.getInstance();
    }

    public int save(Lote lote){
        return this.loteRepository.save(lote);
    }

    public List<Lote> findAll(){
        return this.loteRepository.findAll();
    }
}
