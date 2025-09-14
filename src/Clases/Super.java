package Clases;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import java.util.TreeSet;

public class Super {

    private TreeSet<Producto> productos = new TreeSet(Producto.compararPorCodigo); // TreeMap<codigo,Producto>;

    public Super() {
    }

//METODO PARA AGREGAR PRODUCTO AL ARREGLO     
    public void agregarProducto(Producto pr) {

        productos.add(pr);//lo agrega al arreglo
        System.out.println("PRODUCTO AGREGADO");

    }
//METODO QUE REMUEVE UN PRODUCTO POR EL CODIGO

    public void borrarProducto(Producto p) {
        productos.remove(p);
        System.out.println("PRODUCTO BORRADO");
        
    }
//METODO QUE ME RETORNA EL ARREGLO CON TODOS LOS ELEMENTOS

    public TreeSet<Producto> getProductos() {
        return productos;
    }

//METODO QUE FILTRA PRODUCTOS SEGUN LA CATEGORIA
    public TreeSet<Producto> filtrarPorCategoria(String cat) {
        TreeSet<Producto> productosCat = new TreeSet(Producto.compararPorCodigo);
        //recorremos los elementos del treemap. pero solo los valores del treemap no las llaves.
        for (Producto pro : productos) {
            //el .equals equivale a decir = si este es igual a este. entra en el bloque de abajo
            if (pro.getRubro().equals(cat)) {//si las dos categorias coinciden
                productosCat.add(pro);//se agrega el producto a la lista.
            }
        }
        return productosCat;//retorna el arreglo.
    }
//METODO QUE FILTRA PRODUCTOS SEGUN LA DESCRIPCION

    public TreeSet<Producto> filtrarPorDescripcion(String descr) {

        TreeSet<Producto> productosNom = new TreeSet(Producto.compararPorCodigo);
        for (Producto pro : productos) {
            //Setea todo a minusculas
            String minusA = pro.getDescripcion().toLowerCase();
            String minusB = descr.toLowerCase();
            if (minusA.startsWith(minusB)) {
                productosNom.add(pro);
            }
        }
        return productosNom;
    }

    public TreeSet<Producto> filtrarPorPrecio(Double precioA, Double precioB) {
        //ejemplo de precio: entre precioA(2500) y precioB(3000)
        //la lista me retornara productos que esten entre esos dos precios o sean iguales.
        TreeSet<Producto> productosPr = new TreeSet(Producto.compararPorCodigo);

        for (Producto pro : productos) {
            //Si el precio es mayor o igual al precioA y  si menor o igual al precioB.
            if (pro.getPrecio() >= precioA & pro.getPrecio() <= precioB) {
                productosPr.add(pro);//agrega el producto a la lista
            }
        }
        return productosPr;
    }

}
