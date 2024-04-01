package Inscripcion;

import java.util.List;

public class Inscripcion {
    private Alumno alumnoAInscribir;
    private List <Materia> materias;

    public Inscripcion (List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumnoAInscribir = alumno;
    }

    public boolean aprobado () {
        return this.materias.stream().allMatch(materia->this.alumnoAInscribir.cumpleConCorrelativas(materia));
    }
}