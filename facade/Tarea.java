public class Tarea {
    private String nombre;
    private String estado;
    private String fechaVencimiento;
    private String prioridad;

    public Tarea(String nombre, String estado, String fechaVencimiento, String prioridad) {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
    }

    // Getters y Setters para ahorrar tiempo aqui se uso el asistente AI
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + " | Estado: " + estado + " | Fecha: " + fechaVencimiento + " | Prioridad: " + prioridad;
    }
}