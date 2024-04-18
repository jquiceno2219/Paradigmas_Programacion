package Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        SistemaSeguimientoPaquetes paquetes = new SistemaSeguimientoPaquetes();

        // Agregar algunos paquetes y actualizar su estado
        paquetes.agregarPaquete("123456");
        paquetes.agregarPaquete("789012");

        // Actualizar el estado de un paquete
        paquetes.updatePaquete("123456", Estado.ENTREGADO, "Ciudad destino");

        // Rastrear un paquete específico
        Paquete pq1 = paquetes.trackPaquete("123456");
        System.out.println(pq1);

        // Rastrear otro paquete
        Paquete pq2 = paquetes.trackPaquete("789012");
        System.out.println(pq2);
    }
}
