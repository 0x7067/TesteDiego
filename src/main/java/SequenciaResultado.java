/**
 * Essa classe armazena os resultados de forma imutável, por isso não há setters
 * Apenas getters para retornar os valores dos resultados
 * @author pedroguimaraes
 */

public class SequenciaResultado {
    private final String charRepetido;
    private final int numeroRepeticoes;

    /**
     * @param charSequencia, armazena o caractere que forma a maior sequencia de caracteres que se repetem
     * @param numeroRepeticoes, armazena o numero de vezes que o caractere se repete
     */
    public SequenciaResultado(String charSequencia, int numeroRepeticoes) {
        super();
        this.charRepetido = charSequencia;
        this.numeroRepeticoes = numeroRepeticoes;
    }

    public String getCharRepetido() {
        return charRepetido;
    }

    public int getNumeroRepeticoes() {
        return numeroRepeticoes;
    }

    public String toString() {
        String resultado = "";
        for(int i = 0; i < this.numeroRepeticoes; i++) {
            resultado += this.charRepetido;
        }
        return resultado;
    }
}