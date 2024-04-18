package Ejercicio_4;

public class Paquete {
    private String id;
    private Estado estado;
    private String ubicacion;

    public Paquete(String id) {
        this.id = id;
        this.estado = Estado.EN_TRANSITO;
        this.ubicacion = "Almacén";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void actualizarEstado(Estado estado, String ubicacion) {
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Paquete "+ id +
                " - Estado: " + estado +
                " - Ubicación: " + ubicacion;
    }
}