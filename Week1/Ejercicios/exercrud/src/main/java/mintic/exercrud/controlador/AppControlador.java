package mintic.exercrud.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mintic.exercrud.modelo.productos;
import mintic.exercrud.servicio.ProductoServicio;

@Controller
public class AppControlador {
    
    @Autowired
    private ProductoServicio servicio;

    @RequestMapping("/")
    public String verIndex(Model model){
        List<productos> listaProductos = servicio.listar();
        model.addAttribute("listaProductos", listaProductos);
        return "index";
    }
}
