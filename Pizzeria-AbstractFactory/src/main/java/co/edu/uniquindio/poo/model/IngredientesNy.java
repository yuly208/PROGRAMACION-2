package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.model.Chicago.MasaGruesa;
import co.edu.uniquindio.poo.model.NewYork.MasaFina;
import co.edu.uniquindio.poo.model.NewYork.QuesoMozzarella;
import co.edu.uniquindio.poo.model.NewYork.SalsaTomate;

public class IngredientesNy implements IngredietesFactory{


    public Salsa crearSalsa(){
        return new SalsaTomate();
    }

    public Masa crearMasa(){
        return new MasaFina();
    }

    public Queso crearQueso(){
        return new QuesoMozzarella();
    }


}
