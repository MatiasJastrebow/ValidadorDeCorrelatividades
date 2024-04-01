package Inscripcion;

import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List <Materia> materiasAprobadas;

    public Alumno (String nombre, Integer legajo, List <Materia> correlativas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = correlativas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean cumpleConCorrelativas (Materia materia) {
        List<Materia> listaCorrelativas = materia.getMateriasCorrelativas();
        return listaCorrelativas.stream().allMatch(correlativa -> this.materiasAprobadas.contains(correlativa));
    }
}
