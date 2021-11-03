package prueba.proyecto1.controlador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Productos, Integer> {
    
}
