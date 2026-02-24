import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSoma() {
        // Testando soma de n�meros positivos
        assertEquals(5, calculadora.soma(2, 3));

        // Testando soma de n�meros negativos
        assertEquals(-1, calculadora.soma(-2, 1));

        // Testando soma com zero
        assertEquals(0, calculadora.soma(0, 0));
        assertEquals(2, calculadora.soma(2, 0));
        assertEquals(-2, calculadora.soma(-2, 0));
    }

    @Test
    void testDividir() {
        // Testando divis�o normal
        assertEquals(2, calculadora.dividir(6, 3));

        // Testando divis�o com resultado negativo
        assertEquals(-2, calculadora.dividir(6, -3));

        // Testando divis�o com n�mero negativo
        assertEquals(-2, calculadora.dividir(-6, 3));

        // Testando divis�o com zero no numerador
        assertEquals(0, calculadora.dividir(0, 3));
    }


    @Test
void testDividirPorZero() {
    // Testando exceção ao dividir por zero
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        calculadora.dividir(6, 0);
    });

    // Adicionando print para verificar qual mensagem está sendo gerada
    System.out.println("Mensagem da exceção: " + exception.getMessage());

    // Comparando a mensagem exata (ajustada para corresponder corretamente)
    assertEquals("Divisão por zero", exception.getMessage());
}

}
