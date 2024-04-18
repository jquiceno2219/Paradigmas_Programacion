package Ejercicio_4;

//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SistemaSeguimientoPaquetes {

    private Map<String, Paquete> paquetes;

    public SistemaSeguimientoPaquetes() {
        this.paquetes = new HashMap<>();
    }

 /*  public Mono<Paquete> enviarPaquete(String id) {
        Paquete paquete = new Paquete(id);
        paquetes.put(id, paquete);
        return Mono.just(paquete);
    }*/
}
