package domain;

import Inscripcion.Inscripcion;
import org.junit.Assert;
import org.junit.Test;

public class TestInscripcion extends BaseTests {

    @Test
    public void alumnoCumpleConCorrelativas() {
        Assert.assertTrue(alumno.cumpleConCorrelativas(disenoDeSistemas));
    }

    @Test
    public void alumnoNoCumpleConCorrelativas() {
        Assert.assertFalse(alumno.cumpleConCorrelativas(fisica2));
    }

    @Test
    public void alumnoSePuedeIsncribir() {
        Inscripcion inscripcion = new Inscripcion(listaDiseno, alumno);
        Assert.assertTrue(inscripcion.aprobado());
    }

    @Test
    public void alumnoNoSePuedeIsncribir() {
        Inscripcion inscripcion = new Inscripcion(disenoYFisica2, alumno);
        Assert.assertFalse(inscripcion.aprobado());
    }
}
