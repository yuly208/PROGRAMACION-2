package co.edu.uniquindio.poo.model;


import co.edu.uniquindio.poo.model.Chicago.MasaGruesa;
import co.edu.uniquindio.poo.model.Chicago.QuesoCheddar;
import co.edu.uniquindio.poo.model.Chicago.SalsaBBQ;

public class IngredientesChicago implements IngredietesFactory {

    public Salsa crearSalsa() {
        return new SalsaBBQ();
    }

    public Queso crearQueso() {
        return new QuesoCheddar();
    }

    public Masa crearMasa() {
        return new MasaGruesa();
    }
}