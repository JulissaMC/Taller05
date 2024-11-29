import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nombre;
    private String email;
    private List<Tarea> tareas;

    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
        System.out.println("Tarea '" + tarea.getNombre() + "' asignada al usuario: " + nombre);
    }

    public void eliminarTarea(Tarea tarea){
        if (tareas.remove(tarea)){
            System.out.println("Tarea '" + tarea.getNombre() + "' eliminada del usuario: " + nombre);
        } else {
            System.out.println("La tarea no está asignada al usuario: " + nombre);
        }
    }

    public void verTareasAsignadas(){
        System.out.println("Tareas asignadas al usuario " + nombre + ":");
        if (tareas.isEmpty()){
            System.out.println("No hay tareas asignadas.");
        }else{
            for (Tarea tarea : tareas) 
                System.out.println("- " + tarea.getNombre() + " | Estado: " + tarea.getEstado() + " | Prioridad: " + tarea.getPrioridad());
            }
        }
    }

