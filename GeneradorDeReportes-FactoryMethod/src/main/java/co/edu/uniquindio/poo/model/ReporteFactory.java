package co.edu.uniquindio.poo.model;

public abstract class ReporteFactory {

    public abstract Reporte crearReporte();

    public void generarReporte(){
        Reporte r = crearReporte();
        r.generarReporte();
    }



}
