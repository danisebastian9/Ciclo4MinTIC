package mintic.exercrud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mintic.exercrud.modelo.ProductoRepositorio;
import mintic.exercrud.modelo.productos;

@Service
@Transactional
public class ProductoServicio {
    
    @Autowired
    private ProductoRepositorio repo;

    public List<productos> listar(){
        return repo.findAll();
    }

    public productos listarId(int id){
        return repo.findById(id).get();
    }

    public void save(productos p){
        repo.save(p);
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
