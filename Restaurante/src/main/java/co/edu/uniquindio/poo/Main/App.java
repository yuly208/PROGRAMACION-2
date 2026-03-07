package co.edu.uniquindio.poo.Main;


import co.edu.uniquindio.poo.model.Pedido;

public class App {
    public static void main(String[] args) {


        // Pedido completo
        Pedido p1 = new Pedido.Builder()
                .conPlatoPrincipal("Bandeja Paisa")
                .conEntrada("Empanadas")
                .conBebida("Jugo de lulo")
                .conPostre("Tres leches")
                .build();


        // Pedido mínimo
        Pedido p2 = new Pedido.Builder()
                .conPlatoPrincipal("Sancocho")
                .conObservaciones("Sin cilantro")
                .build();


        // ❌ Esto DEBE fallar:
        // Pedido p3 = new Pedido.Builder().conBebida("Agua").build();




    }
}
