package co.edu.uniquindio.poo.model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CarritoCompras {

    // pieza 1 el atributo estatico
    private static CarritoCompras instacia;


    private ArrayList<String> productos;

    //pieza 2 el constructor privado
    private CarritoCompras(){
        productos = new ArrayList<>();
    }

    //pieza 3 el metodo publico statico
    public static CarritoCompras getInstancia(){
        if(instacia == null){
            instacia = new CarritoCompras();
        }

        return instacia;
    }


    public void agregar(String producto){
        productos.add(producto);
    }

    public void listar(){
        for (String p : productos){
            System.out.println(p);
        }
    }

    public int getTotal(){
        return productos.size();
    }


}
