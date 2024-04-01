package domain;

import Inscripcion.Alumno;
import Inscripcion.Materia;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseTests {
    protected List<Materia> materiasCorrelativasDiseno;
    protected List<Materia> materiasCorrelativasFisica2;
    protected List<Materia> listaDiseno;
    protected List<Materia> disenoYFisica2;
    protected List<Materia> listaVacia;
    protected Alumno alumno;
    protected List<Materia> materiasAprobadas;
    protected Materia disenoDeSistemas;
    protected Materia fisica2;

    protected BaseTests() {
        this.materiasCorrelativasDiseno        = new ArrayList<>();
        this.materiasCorrelativasFisica2       = new ArrayList<>();
        this.listaVacia                        = new ArrayList<>();
        this.materiasAprobadas                 = new ArrayList<>();
        this.listaDiseno                       = new ArrayList<>();
        this.disenoYFisica2                    = new ArrayList<>();
    }

    @Before
    public void inicializar() {
        this.inicializarListaVacia();
        this.inicializarMateriasCorrelativasDiseno();
        this.inicializarMateriasCorrelativasFisica2();
        this.disenoDeSistemas = new Materia("Diseno de Sistemas", materiasCorrelativasDiseno);
        this.fisica2 = new Materia("Fisica 2", materiasCorrelativasFisica2);
        this.inicializarListaDiseno();
        this.inicializarDisenoYFisica2();
        this.materiasAprobadas = materiasCorrelativasDiseno;
        this.alumno = new Alumno("Matias", 2090340, materiasAprobadas);
    }

    private void inicializarListaVacia() {
        Materia[] correlativas = {};
        Collections.addAll(this.listaVacia, correlativas);
    }

    private void inicializarMateriasCorrelativasDiseno() {
        Materia[] correlativas = {
                new Materia("paradigmasDeProgramacion", listaVacia),
                new Materia("analisisDeSistemas", listaVacia),
        };
        Collections.addAll(materiasCorrelativasDiseno, correlativas);
    }

    private void inicializarMateriasCorrelativasFisica2() {
        Materia[] correlativas = {
                new Materia("Fisica1", listaVacia),
        };
        Collections.addAll(materiasCorrelativasFisica2, correlativas);
    }

    private void inicializarDisenoYFisica2() {
        Materia[] inscripciones = {
                disenoDeSistemas,
                fisica2,
        };
        Collections.addAll(disenoYFisica2, inscripciones);
    }

    private void inicializarListaDiseno() {
        Materia[] inscripciones = {
                disenoDeSistemas,
        };
        Collections.addAll(listaDiseno, inscripciones);
    }
}
