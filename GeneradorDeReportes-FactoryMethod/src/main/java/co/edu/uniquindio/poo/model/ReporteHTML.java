package co.edu.uniquindio.poo.model;

public class ReporteHTML implements Reporte{

    public void generarReporte(){
        System.out.println("Generando Reporte en HTML");
    }

    public String getTipo(){
        return "HTML";
    }




}
