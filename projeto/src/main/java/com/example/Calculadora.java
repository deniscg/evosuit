public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        return a / b;
    }
}
