package co.edu.uniquindio.poo.model;

public class ReportePDF implements Reporte{

   public void generarReporte(){
       System.out.println("Generando Reporte en PDF");
   }

    public  String getTipo(){
       return "PDF";
    }


}
