package co.edu.uniquindio.poo.model;

public class Pizza {

    private Salsa salsa;
    private Queso queso;
    private Masa masa;

    public Pizza(IngredietesFactory f) {

        salsa = f.crearSalsa();
        queso = f.crearQueso();
        masa = f.crearMasa();
    }

    public void mostrar() {

        System.out.println(salsa.descripcion());
        System.out.println(queso.descripcion());
        System.out.println(masa.descripcion());

        double total = salsa.precio() + queso.precio() + masa.precio();

        System.out.println("Precio total: " + total);
    }
}