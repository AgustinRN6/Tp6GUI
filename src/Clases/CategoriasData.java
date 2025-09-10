
package Clases;

import java.util.ArrayList;


public class CategoriasData{
    private ArrayList<String> categorias = new ArrayList();
    
    //Metodo que retorna un ArrayList, para llenar el JComboBox del JFrame
    public ArrayList<String> getCategorias(){
        String a = "Electronica";
        String b = "Comida";
        String c = "Ropa";
        String d = "Articulos de Limpieza";
        String e = "Bebidas";
        categorias.add(a);
        categorias.add(b);
        categorias.add(c);
        categorias.add(d);
        categorias.add(e);
        return categorias;
    }
    
    
}
