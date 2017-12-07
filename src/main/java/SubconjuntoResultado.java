/**
 * Essa classe armazena os resultados de forma imutável, por isso não há setters
 * Apenas getters para retornar os valores dos resultados
 * @author pedroguimaraes
 */
public class SubconjuntoResultado {
    private final long somaMaxima;
    private final int posicaoInicial;
    private final int posicaoFinal;

    /**
     * @param somaMaxima, armazena a soma do subconjunto de soma máxima
     * @param posicaoInicial, posição inicial no conjunto original onde se encontra o começo do subconjunto máximo
     * @param posicaoFinal, posição final no conjunto original onde se encontra o começo do subconjunto máximo
     */
    public SubconjuntoResultado(long somaMaxima, int posicaoInicial, int posicaoFinal) {
        super();
        this.somaMaxima = somaMaxima;
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posicaoFinal;
    }

    /**
     * Retorna a soma máxima
     * @return long somaMaxima
     */
    public long getSomaMaxima() {
        return somaMaxima;
    }


    /**
     * Retorna a posicao inicial
     * @return posicaoInicial
     */
    public int getPosicaoInicial() {
        return posicaoInicial;
    }

    /**
     * Retorna a posicao final
     * @return posicaoFinal
     */
    public int getPosicaoFinal() {
        return posicaoFinal;
    }

    public String toString() {
        return "Subconjunto máximo:\nPosição inicial: "  + this.posicaoInicial +
                "\nPosicão Final: " + this.posicaoFinal +
                "\nSoma Maxima: " + this.somaMaxima;
    }
}
