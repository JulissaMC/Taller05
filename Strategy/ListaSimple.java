import java.util.List;

public class ListaSimple implements VerEstrategia{
    @Override
    public void verTarea(List<Tarea> tareas){
        System.out.println("Visualización en formato de lista simple:");
        for (Tarea tarea : tareas){
            System.out.println("- " + tarea.getNombre() + " | Estado: " + tarea.getEstado());
        }
    }
}
