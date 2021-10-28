package mintic.edu.crudjpathyme.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import antlr.collections.List;
import mintic.edu.crudjpathyme.Modelo.Productos;
import mintic.edu.crudjpathyme.servicio.ProductoServicio;

@Controller
public class AppControlador {
    
    // Crear un metodo que recibe la orden de alguna url, recibe parametros
    // llama metodos al DAO, crea objetos or variables nuevas a mostrar en la nueva vista
    // Enviar la salida a la nueva vista

    @Autowired
    private ProductoServicio servicio;

    @RequestMapping("/")
    public String verIndex(Model model){
        List<Productos> listaProductos = servicio.listar();
        model.addAttribute("listaProductos", listaProductos);
        return "index";
    }

    @RequestMapping("/new")
    public String mostrarPaginaNuevoProducto(Model model){
        Productos producto = new Productos;
        return "nuevo_producto";
    }
}
