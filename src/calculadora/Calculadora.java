package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a
 * operação desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes
 * unitários.</p>
 *
 * @author luiz jandoza 
 * @version 1.0
 */
public class Calculadora {

    /**
     * Atributo que armazena o último resultado calculado.
     */
    private int r = 0;

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a * b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * <p>Não é permitido divisão por zero; neste caso, uma
     * {@link IllegalArgumentException} será lançada com uma mensagem clara
     * para o usuário.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a / b}
     * @throws IllegalArgumentException se {@code b == 0}
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+" : soma</li>
     *     <li>"-" : subtração</li>
     *     <li>"*" : multiplicação</li>
     *     <li>"/" : divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em {@link IllegalArgumentException}.</p>
     *
     * @param a  primeiro operando
     * @param b  segundo operando
     * @param op operador que indica a operação desejada
     * @return resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     *                                  ou se houver tentativa de divisão por zero
     */
    public int calc(int a, int b, String op) {
        switch (op) {
            case "+":
                r = somar(a, b);
                break;
            case "-":
                r = subtrair(a, b);
                break;
            case "*":
                r = multiplicar(a, b);
                break;
            case "/":
                r = dividir(a, b);
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: \"" + op + "\"");
        }

        return r;
    }
}



