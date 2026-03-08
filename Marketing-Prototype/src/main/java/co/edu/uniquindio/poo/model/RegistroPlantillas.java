package co.edu.uniquindio.poo.model;
import java.util.HashMap;
import java.util.Map;

public class RegistroPlantillas {

    private Map<String, Prototipo> cache = new HashMap<>();

    public void registrar(String clave, Prototipo proto){
        cache.put(clave, proto);
    }

    public Prototipo obtener(String clave){
        Prototipo proto = cache.get(clave);

        if(proto != null){
            return proto.clonar();
        }

        return null;
    }



}
