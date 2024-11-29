import java.util.List;

public class VerCalendario implements VerEstrategia{
    @Override
    public void verTarea(List<Tarea> tareas){
        System.out.println("Visualización en formato de calendario:");
        for (Tarea tarea : tareas){
            System.out.println("Fecha: " + tarea.getFechaVencimiento() + " | Tarea: " + tarea.getNombre());
        }
    }
}
