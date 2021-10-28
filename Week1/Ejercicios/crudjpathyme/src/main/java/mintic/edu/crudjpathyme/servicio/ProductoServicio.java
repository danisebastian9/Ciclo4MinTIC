package mintic.edu.crudjpathyme.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import antlr.collections.List;

@Service
@Transactional
public class ProductoServicio {
    
    @Autowired
    private ProductoRepositorio repo;

    // Listar los procuctos.
    public List<Productos> listar(){
        return repo.findAll();
    }

    // Editar los procuctos.
    public Productos listarId(int id){
        return repo.findById(id).get();
    }

    // Crear los procuctos.
    public void save(Productos p){
        repo.save(p);
    }

    // Eliminar los procuctos.
    public void delete(int id){
        repo.deleteById(id);
    }
}
