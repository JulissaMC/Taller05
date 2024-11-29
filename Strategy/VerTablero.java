import java.util.List;

public class VerTablero implements VerEstrategia{
    @Override
    public void verTarea(List<Tarea> tareas){
        System.out.println("Visualización en formato de tablero:");
        for (Tarea tarea : tareas){
            System.out.println("Tarea: " + tarea.getNombre() + " | Prioridad: " + tarea.getPrioridad());
        }
    }
}
