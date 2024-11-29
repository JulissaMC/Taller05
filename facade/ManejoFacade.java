import java.util.List;

public class ManejoFacade {
    private AdministrarTarea administrarTarea;

    public ManejoFacade() {
        this.administrarTarea = new AdministrarTarea();
    }

    public void crearTarea(String nombre, String estado, String fechaVencimiento, String prioridad) {
        Tarea tarea = new Tarea(nombre, estado, fechaVencimiento, prioridad);
        administrarTarea.agregarTarea(tarea);
    }

    public void establecerPrioridad(String nombre, String nuevaPrioridad) {
        administrarTarea.modificarTarea(nombre, null, nuevaPrioridad, null);
    }


    public void establecerFechaVencimiento(String nombre, String nuevaFecha) {
        administrarTarea.modificarTarea(nombre, null, null, nuevaFecha);
    }

    public void verTareas() {
        List<Tarea> tareas = administrarTarea.obtenerTareas();
        System.out.println("Lista de tareas:");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public void eliminarTarea(String nombre) {
        administrarTarea.eliminarTarea(nombre);
    }
}