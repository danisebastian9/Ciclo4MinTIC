package mintic.exercrud.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class productos {
    // Atributos
    @Id
    private int codigo_producto;
    private double ivacompra;
    private int nitproveedor_key;
    private String nombre_producto;
    private double precio_compra;
    private double precio_venta;


    // Constructores:
    public productos() {
    }


    public productos(int codigo_producto, double ivacompra, int nitproveedor_key, String nombre_producto,
            double precio_compra, double precio_venta) {
        this.codigo_producto = codigo_producto;
        this.ivacompra = ivacompra;
        this.nitproveedor_key = nitproveedor_key;
        this.nombre_producto = nombre_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }

    // Setters & Getters

    public int getCodigo_producto() {
        return codigo_producto;
    }


    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }


    public double getIvacompra() {
        return ivacompra;
    }


    public void setIvacompra(double ivacompra) {
        this.ivacompra = ivacompra;
    }


    public int getNitproveedor_key() {
        return nitproveedor_key;
    }


    public void setNitproveedor_key(int nitproveedor_key) {
        this.nitproveedor_key = nitproveedor_key;
    }


    public String getNombre_producto() {
        return nombre_producto;
    }


    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }


    public double getPrecio_compra() {
        return precio_compra;
    }


    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }


    public double getPrecio_venta() {
        return precio_venta;
    }


    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }


    // ToString
    @Override
    public String toString() {
        return "productos [codigo_producto=" + codigo_producto + ", ivacompra=" + ivacompra + ", nitproveedor_key="
                + nitproveedor_key + ", nombre_producto=" + nombre_producto + ", precio_compra=" + precio_compra
                + ", precio_venta=" + precio_venta + "]";
    }
 
    
}
