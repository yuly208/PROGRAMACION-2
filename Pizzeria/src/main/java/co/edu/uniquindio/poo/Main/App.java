package co.edu.uniquindio.poo.Main;

import co.edu.uniquindio.poo.model.*;

public class App {

    public static void main(String[] args) {

        IngredietesFactory ny = new IngredientesNy();
        Pizza pizzaNY = new Pizza(ny);

        System.out.println("Pizza New York");
        pizzaNY.mostrar();

        IngredietesFactory chicago = new IngredientesChicago();
        Pizza pizzaChicago = new Pizza(chicago);

        System.out.println("Pizza Chicago");
        pizzaChicago.mostrar();
    }
}