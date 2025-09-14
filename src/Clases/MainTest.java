/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Map;

/**
 *
 * @author Agustin
 */
public class MainTest {
    public static void main(String[] args){
     Super DeTodoSA = new Super();
    //CREAMOS LOS PRODUCTOS Y CODIGOS PARA AGREGARLOS AL TREEMAP DE LA CLASE SUPER
    Producto prod1= new Producto("Electrodomestico","Monitor",240.000,"Resolucion: 1980x 2400, 240hz",12,1);
    DeTodoSA.agregarProducto(prod1);
    Producto prod2= new Producto("Comida","Arroz",1.300,"Paquete de 1kg",12,2);
    DeTodoSA.agregarProducto(prod2);
    Producto prod3 = new Producto("Bebida","Coca-Cola",3.700,"Bebida de 2,5Lt",12,3);
    DeTodoSA.agregarProducto(prod3);
    Producto prod4= new Producto("Ropa","Campera de invierno",80.000,"Hecha de algodon",12,4);
    DeTodoSA.agregarProducto(prod4);
    Producto prod5= new Producto("Electrodomestico","Lavarropa",300.000,"Marca lenovo",12,5);
    DeTodoSA.agregarProducto(prod5);
    Producto prod6= new Producto("a","a",0.0,"a",12,6);
    DeTodoSA.agregarProducto( prod6);
    //METODO QUE RETORNA TODOS LOS PRODUCTOS
        System.out.println("TODOS LOS PRODUCTOS:");
        for(Producto productos:DeTodoSA.getProductos()){
            System.out.println("Producto: "+ productos.getProducto());
        }
        
     System.out.println(".........................................................");
    
    //METODOS DE FILTRAR POR CATEGORIA/PRECIO/NOMBRE
   
    //FILTRAR POR CATEGORIA
        System.out.println("METODO FILTRAR POR CATEGORIA");
    for(Producto p:  DeTodoSA.filtrarPorCategoria("Electrodomestico")){
        System.out.println(p.getProducto());
    }
        System.out.println(".........................................................");
    //FILTRAR POR NOMBRE
        System.out.println("METODO FILTRAR POR DESCRIPCION");
    for(Producto p: DeTodoSA.filtrarPorDescripcion("BEb")){
        System.out.println(p.getProducto());
    }
      System.out.println(".........................................................");
    //FILTRAR POR PRECIO
        System.out.println("METODO FILTRAR POR PRECIO ENTRE 3.700 HASTA 400.000");
    double precioA = 3.700;
    double precioB = 400.000;
    for( Producto p: DeTodoSA.filtrarPorPrecio(precioA, precioB)){
        System.out.println(p.getProducto());
    }
          System.out.println(".........................................................");
    //METODO PARA BORRAR
        System.out.println("METODO QUE BORRA EL PRODUCTO DE LA LISTA");
        DeTodoSA.borrarProducto(prod6);
    System.out.println(".........................................................");

    }
    
}
