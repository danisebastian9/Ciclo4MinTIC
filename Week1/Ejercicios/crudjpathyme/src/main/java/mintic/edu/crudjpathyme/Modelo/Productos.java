package mintic.edu.crudjpathyme.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
   
    // Atributos
    @Id
    private int codigo;
    private String nombre;
    private int nitproveedor;
    private double precio_compra;
    private double iva;
    private double precio_venta;
    
    // Constructores
    public Productos() {
    }


    public Productos(int codigo, String nombre, int nitproveedor, double precio_compra, double iva,
            double precio_venta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nitproveedor = nitproveedor;
        this.precio_compra = precio_compra;
        this.iva = iva;
        this.precio_venta = precio_venta;
    }


    // Getters & Setters
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNitproveedor() {
        return nitproveedor;
    }


    public void setNitproveedor(int nitproveedor) {
        this.nitproveedor = nitproveedor;
    }


    public double getPrecio_compra() {
        return precio_compra;
    }


    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }


    public double getIva() {
        return iva;
    }


    public void setIva(double iva) {
        this.iva = iva;
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
        return "Productos [codigo=" + codigo + ", iva=" + iva + ", nitproveedor=" + nitproveedor + ", nombre=" + nombre
                + ", precio_compra=" + precio_compra + ", precio_venta=" + precio_venta + "]";
    }

    
}