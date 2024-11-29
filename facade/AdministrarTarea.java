import java.util.ArrayList;
import java.util.List;

public class AdministrarTarea {
    private List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agg: " + tarea.getNombre());
    }

    public void modificarTarea(String nombre, String nuevoEstado, String nuevaPrioridad, String nuevaFecha) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                tarea.setEstado(nuevoEstado);
                tarea.setPrioridad(nuevaPrioridad);
                tarea.setFechaVencimiento(nuevaFecha);
                System.out.println("Tarea modifcada: " + tarea);
                return;
            }
        }
        System.out.println("Tarea no encontrada: " + nombre);
    }

    // Eliminar una tarea
    public void eliminarTarea(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
        System.out.println("Tarea elimiminada: " + nombre);
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}