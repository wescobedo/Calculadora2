package cl.praxis;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(37, calculadora.sumar(15,22));
    }

    @Test
    public void testRestar() {
        assertEquals(50, calculadora.restar(60,10));
    }

    @Test
    public void testMultiplicar() {
      assertEquals(25, calculadora.multiplicar(5,5));
    }

    @Test
    public void testDividir() {
      assertEquals(15, calculadora.dividir(30,2));
    }

}
