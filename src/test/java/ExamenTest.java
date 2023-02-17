import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExamenTest {

    @Test
    void testPrimero() {
        System.out.println("Casos de prueba");
        assertEquals(1000.0,Examen.ej9('N',1000,1));
    }

    @Test
    void testSegundo() {
        System.out.println("Casos de prueba");
        assertEquals(1001.0,Examen.ej9('E',1001,1));
    }

   /* @Test
    void testTercero() {
        System.out.println("Casos de prueba");
        assertEquals(1,Examen.ej9('R',1000,1)); Es incorrecto porque tiene de parámetro una R la cual no aparece en el código.
    }

    @Test
    void testCuarto() {
        System.out.println("Casos de prueba");
        assertEquals(1,Examen.ej9('N',1000,0)); El resultado es incorrecto porque no puede tener 0, mínimo es 1
    }

    @Test
    void testQuinto() {
        System.out.println("Casos de prueba");
        assertEquals(1,Examen.ej9('N',999,1)); El resultado es incorrecto porque no puede ser 999, tiene que ser mínimo 1000
    }*/

}
