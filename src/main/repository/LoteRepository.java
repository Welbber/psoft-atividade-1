package src.main.repository;

import src.main.entity.Lote;

import java.util.ArrayList;
import java.util.List;

public class LoteRepository {

    private static LoteRepository loteRepository;

    private List<Lote> lotes;

    private LoteRepository(){
        this.lotes = new ArrayList<Lote>();
    }

    public static LoteRepository getInstance(){
        if(loteRepository == null)
            loteRepository = new LoteRepository();
        return loteRepository;
    }

    public int save(Lote lote){
        this.lotes.add(lote);
        return lotes.size();
    }

    public List<Lote> findAll(){
        return this.lotes;
    }


}