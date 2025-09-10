
package Clases;


public class Producto {
    private String rubro;
    private String nombre;
    private Double precio;
    private String descripcion;
   
    
   public Producto(String rubro, String nombre, Double precio, String descripcion){
       this.rubro = rubro;
       this.nombre = nombre;
       this.precio = precio;
       this.descripcion = descripcion;
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
    public String getProducto(){
        return"Nombre: "+ nombre + ", Descripcion: "+ descripcion +", Precio:"+ precio+ ", Rubro: "+ rubro;
    }
   
    
}
