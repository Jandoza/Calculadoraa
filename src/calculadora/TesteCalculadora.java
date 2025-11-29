package calculadora;

/**
 * Classe de teste simples para a {@link Calculadora}.
 *
 * <p>Esta classe simula o uso da calculadora em um cenário de linha de comando,
 * exibindo resultados das operações e tratando situações inválidas como divisão
 * por zero e operador desconhecido.</p>
 */
public class TesteCalculadora {

    /**
     * Método principal para execução dos testes rápidos.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Testes de operações válidas ===");
        System.out.println("2 + 3  = " + calc.calc(2, 3, "+"));   // esperado: 5
        System.out.println("10 - 4 = " + calc.calc(10, 4, "-"));  // esperado: 6
        System.out.println("3 * 5  = " + calc.calc(3, 5, "*"));   // esperado: 15
        System.out.println("8 / 2  = " + calc.calc(8, 2, "/"));   // esperado: 4

        System.out.println();
        System.out.println("=== Testes de erros / robustez ===");

        // Divisão por zero
        try {
            System.out.println("8 / 0  = " + calc.calc(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println("Divisão por zero: " + e.getMessage());
        }

        // Operador inválido
        try {
            System.out.println("5 x 5  = " + calc.calc(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida: " + e.getMessage());
        }
    }
}



