package co.edu.uniquindio.poo.model;


import java.util.ArrayList;
import java.util.List;

public class PlantillaEmail implements Prototipo {

    private String asunto;
    private String cuerpoHtml;
    private List<String> destinatarios;
    private List<String> etiquetas;

    public PlantillaEmail(String asunto, String cuerpoHtml, List<String> destinatarios, List<String> etiquetas){
        this.asunto = asunto;
        this.cuerpoHtml = cuerpoHtml;
        this.destinatarios = destinatarios;
        this.etiquetas = etiquetas;
    }

    public List<String> getDestinatarios(){
        return destinatarios;
    }


    @Override
    public Prototipo clonar(){

        List<String> copiaDestinatarios = new ArrayList<>(destinatarios);
        List<String> copiaEtiquetas = new ArrayList<>(etiquetas);

        return new PlantillaEmail(
                asunto,
                cuerpoHtml,
                copiaDestinatarios,
                copiaEtiquetas);
    }
}