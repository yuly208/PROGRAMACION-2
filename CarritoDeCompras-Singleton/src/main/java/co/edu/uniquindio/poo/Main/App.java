package co.edu.uniquindio.poo.Main;


import co.edu.uniquindio.poo.model.CarritoCompras;

public class App {
    public static void main(String[] args) {



                CarritoCompras c1 = CarritoCompras.getInstancia();
                CarritoCompras c2 = CarritoCompras.getInstancia();

                c1.agregar("Laptop");
                c2.agregar("Mouse");

                c1.listar();

                System.out.println("Total: " + c1.getTotal());

                System.out.println(c1 == c2);
            }
        }










