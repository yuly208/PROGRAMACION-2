package co.edu.uniquindio.poo.Main;


import co.edu.uniquindio.poo.model.ReporteFactory;
import co.edu.uniquindio.poo.model.TipoFactory.ExcelFactory;
import co.edu.uniquindio.poo.model.TipoFactory.HTMLFactory;
import co.edu.uniquindio.poo.model.TipoFactory.PDFFactory;

public class App {
    public static void main(String[] args) {

                ReporteFactory factory;

                factory = new PDFFactory();
                factory.generarReporte();

                factory = new ExcelFactory();
                factory.generarReporte();

                factory = new HTMLFactory();
                factory.generarReporte();
            }
        }





