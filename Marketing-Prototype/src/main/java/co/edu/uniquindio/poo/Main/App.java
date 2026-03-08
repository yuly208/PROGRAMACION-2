package co.edu.uniquindio.poo.Main;

import co.edu.uniquindio.poo.model.PlantillaEmail;
import co.edu.uniquindio.poo.model.RegistroPlantillas;

import java.util.*;

public class App {

    public static void main(String[] args) {

        RegistroPlantillas registro = new RegistroPlantillas();

        PlantillaEmail promo = new PlantillaEmail(
                "Promo",
                "<h1>Oferta</h1>",
                new ArrayList<>(),
                new ArrayList<>()
        );

        registro.registrar("promo", promo);

        PlantillaEmail copia = (PlantillaEmail) registro.obtener("promo");

        copia.getDestinatarios().add("cliente@email.com");

        System.out.println("Original: " + promo.getDestinatarios().size());
        System.out.println("Copia: " + copia.getDestinatarios().size());
    }
}