package co.edu.uniquindio.poo.model.TipoFactory;

import co.edu.uniquindio.poo.model.Reporte;
import co.edu.uniquindio.poo.model.ReporteFactory;
import co.edu.uniquindio.poo.model.ReporteHTML;

public class HTMLFactory extends ReporteFactory {

    public Reporte crearReporte(){
        return new ReporteHTML();
    }




}
