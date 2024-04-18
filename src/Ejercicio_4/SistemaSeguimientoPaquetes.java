package Ejercicio_4;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SistemaSeguimientoPaquetes {

    private Map<String, Paquete> paquetes;

    public SistemaSeguimientoPaquetes() {
        this.paquetes = new HashMap<>();
    }

    public void agregarPaquete(String id) {
        paquetes.put(id, new Paquete(id));
    }

    public void updatePaquete(String id, Estado estado, String ubicacion) {
        Paquete pkg = paquetes.get(id);
        if (pkg != null) {
            pkg.setEstado(estado);
            pkg.setUbicacion(ubicacion);
        }
    }

    public Paquete trackPaquete(String id) {
        return paquetes.get(id);
    }



}
