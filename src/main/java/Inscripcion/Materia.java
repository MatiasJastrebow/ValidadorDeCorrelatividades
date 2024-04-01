package Inscripcion;

import java.util.List;

public class Materia {
    private String nombre;
    private List <Materia> materiasCorrelativas;

    public Materia (String nombre, List <Materia> correlativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = correlativas;
    }
    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
