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
    Producto prod1= new Producto("Electrodomestico","Monitor",240.000,"Resolucion: 1980x 2400, 240hz");
    long cod1 = 13354;
    DeTodoSA.agregarProducto(cod1, prod1);
    Producto prod2= new Producto("Comida","Arroz",1.300,"Paquete de 1kg");
    long cod2= 1442;
    DeTodoSA.agregarProducto(cod2, prod2);
    Producto prod3 = new Producto("Bebida","Coca-Cola",3.700,"Bebida de 2,5Lt");
    long cod3= 3942;
    DeTodoSA.agregarProducto(cod3, prod3);
    Producto prod4= new Producto("Ropa","Campera de invierno",80.000,"Hecha de algodon");
    long cod4 = 392023;
    DeTodoSA.agregarProducto(cod4, prod4);
    Producto prod5= new Producto("Electrodomestico","Lavarropa",300.000,"Marca lenovo");
    long cod5 = 341234;
    DeTodoSA.agregarProducto(cod5, prod5);
     Producto prod6= new Producto("a","a",0.0,"a");
    long cod6 = 341234;
    DeTodoSA.agregarProducto(cod6, prod6);
    //METODO QUE RETORNA TODOS LOS PRODUCTOS
        System.out.println("TODOS LOS PRODUCTOS:");
        for(Map.Entry<Long, Producto> productos:DeTodoSA.getProductos().entrySet()){
            System.out.println("Codigo: "+ productos.getKey()+"Producto: "+ productos.getValue().getProducto());
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
        System.out.println("METODO FILTRAR POR NOMBRE");
    for(Producto p: DeTodoSA.filtrarPorNombre("Mar")){
        System.out.println(p.getProducto());
    }
      System.out.println(".........................................................");
    //FILTRAR POR PRECIO
        System.out.println("METODO FILTRAR POR PRECIO ENTRE 3.700 HASTA 400.000");
    double precioA = 3.700;
    double precioB = 400.000;
    for(Producto p: DeTodoSA.filtrarPorPrecio(precioA, precioB)){
        System.out.println(p.getProducto());
    }
          System.out.println(".........................................................");
    }
}
