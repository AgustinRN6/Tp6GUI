
package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Super {
    private TreeMap<Long,Producto> productos = new TreeMap(); // TreeMap<codigo,Producto>;
    
//METODO PARA AGREGAR PRODUCTO AL ARREGLO     
public void agregarProducto(Long cod, Producto pr){
       if(productos.containsKey(cod)){
           System.out.println("Ese codigo ya esta en uso");
       }else{
       productos.put(cod, pr);//lo agrega al arreglo
        System.out.println("CLIENTE AGREGADO");
       }
          
}
//METODO QUE REMUEVE UN PRODUCTO POR EL CODIGO
public void borrarProducto(Long cod){
    productos.remove(cod);
    System.out.println("Producto Removido");
}
//METODO QUE ME RETORNA EL ARREGLO CON TODOS LOS ELEMENTOS
public TreeMap<Long,Producto> getProductos(){
    return productos;
}
//METODO QUE FILTRA PRODUCTOS SEGUN LA CATEGORIA
public ArrayList<Producto> filtrarPorCategoria(String cat){ 
    ArrayList<Producto>productosCat = new ArrayList();
    //recorremos los elementos del treemap. pero solo los valores del treemap no las llaves.
    for(Producto pro: productos.values()){
        //el .equals equivale a decir = si este es igual a este. entra en el bloque de abajo
        if(pro.getRubro().equals(cat)){//si las dos categorias coinciden
            productosCat.add(pro);//se agrega el producto a la lista.
        }
    }
    return productosCat;//retorna el arreglo.
}
//METODO QUE FILTRA PRODUCTOS SEGUN EL NOMBRE
public ArrayList<Producto> filtrarPorNombre(String descr){
    ArrayList<Producto>productosNom = new ArrayList();
        for(Producto pro: productos.values()){
            if(pro.getDescripcion().startsWith(descr)){
                productosNom.add(pro);
            }
        }
    return productosNom;
}

public ArrayList<Producto> filtrarPorPrecio(Double precioA, Double precioB){
    //ejemplo de precio: entre precioA(2500) y precioB(3000)
    //la lista me retornara productos que esten entre esos dos precios o sean iguales.
    ArrayList<Producto>productosPr = new ArrayList();
        
        for(Producto pro: productos.values()){
        //Si el precio es mayor o igual al precioA y  si menor o igual al precioB.
            if(pro.getPrecio() >= precioA & pro.getPrecio() <= precioB){
                productosPr.add(pro);//agrega el producto a la lista
            }
        }
    return productosPr;
}
}
