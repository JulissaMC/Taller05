import java.util.List;

public class VisualizarTarea {
    private VerEstrategia vistaEstrategia;

    public void setVistaEstrategia(VerEstrategia vistaEstrategia) {
        this.vistaEstrategia = vistaEstrategia;
    }

    public void verTareas(List<Tarea> tareas) {
        if (vistaEstrategia != null) {
            vistaEstrategia.verTarea(tareas);
        } else {
            System.out.println("No se ha establecido una estrategia de visualización.");
        }
    }
}
