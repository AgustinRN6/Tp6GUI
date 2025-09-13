
package Clases;

import java.util.Comparator;
import java.util.Objects;


public class Producto {
    private String rubro;
    private String nombre;
    private Double precio;
    private String descripcion;
    private Integer stock;
    private Integer codigo;
   
    
   public Producto(String rubro, String nombre, Double precio, String descripcion, int stock, int codigo){
       this.rubro = rubro;
       this.nombre = nombre;
       this.precio = precio;
       this.descripcion = descripcion;
       this.stock = stock;
       this.codigo = codigo;
   }
   
    public String getRubro() {
        return rubro;
    }
        public void setRubro(String rubro) {
            this.rubro = rubro;
        }

    public String getNombre() {
        return nombre;
    }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    public Double getPrecio() {
        return precio;
    }
        public void setPrecio(Double precio) {
            this.precio = precio;
        }

    public String getDescripcion() {
        return descripcion;
    }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

    public Integer getStock() {
        return stock;
    }
        public void setStock(Integer stock) {
            this.stock = stock;
        }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getProducto(){
        return "Codigo: " + codigo + "Nombre: "+ nombre + ", Descripcion: "+ descripcion +", Precio:"+ precio+ ", Rubro: "+ rubro+ ", Stock:"+ stock;
    }
    
    //Se agrega comparador de nombre y rubro en Producto para utilizarlo en TreeSet.
    public static Comparator<Producto> compararPorRN = new Comparator<>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            if (!(o1.nombre.equalsIgnoreCase(o2.nombre))) {
                return o1.nombre.compareToIgnoreCase(o2.nombre);
            } else {
                return o1.rubro.compareToIgnoreCase(o2.rubro);
            }
        }        
    };

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.rubro, other.rubro)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        return Objects.equals(this.codigo, other.codigo);
    }

    
    
    
   
    
}
