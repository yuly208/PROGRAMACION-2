package co.edu.uniquindio.poo.model;

public class ReporteExcel implements Reporte{

    public void generarReporte(){
        System.out.println("Generando reporte en Excel");
    }

    public String getTipo(){
        return "Excel";
    }


}
