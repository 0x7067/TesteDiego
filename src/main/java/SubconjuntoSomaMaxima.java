/**
 * Partindo de um array qualquer de números inteiros essa classe encontra o subconjunto de maior soma contígua
 * @author pedroguimaraes
 *
 */
public final class SubconjuntoSomaMaxima {

    public static void main(String[] args) {
        int conjuntoInicial[] = {2, -4, 6, 8, -10, 100, -6, 5};
        SubconjuntoResultado resultado = procuraMaiorSubconjunto(conjuntoInicial);
        System.out.print(resultado.toString());
    }

    /**
     * Usando o algoritmo de Kadane, procura todos subconjuntos cuja soma é positiva,
     * um a um os subconjuntos são armazenados na variável somaTemporaria.
     * Em seguida, compara-se o valor de somaTemporaria com o valor de somaMaxima,
     * caso o primeiro seja maior salva-se o valor em somaMaxima.
     *
     * @param conjuntoInicial é o conjunto que representa o vetor de numeros inteiros inicial
     * @return SubconjuntoResultado primeiro subconjunto que tem a maior soma
     */
    public static SubconjuntoResultado procuraMaiorSubconjunto(int conjuntoInicial[]) {
        // Checa se é nulo, caso seja retorne 0, 0, 0 como resposta (convenção minha)
        if(conjuntoInicial.length == 0) {
            return new SubconjuntoResultado(0, 0, 0);
        }

        // Variáveis que irão armazenar os resultados finais
        long somaMaxima = Long.MIN_VALUE;
        int posicaoMaximaInicial = -1;
        int posicaoMaximaFinal = -1;

        // Variáveis temporários de controle, necessárias para o cálculo
        long somaTemporaria = 0;
        int posicaoInicialTemporaria = 0;

        for(int i = 0; i < conjuntoInicial.length; i++) {
            somaTemporaria += conjuntoInicial[i];

            if(somaTemporaria > somaMaxima) {
                somaMaxima = somaTemporaria;
                posicaoMaximaInicial = posicaoInicialTemporaria;
                posicaoMaximaFinal = i;
            }

            if (somaTemporaria < 0) {
                posicaoInicialTemporaria = i + 1;
                somaTemporaria = 0;
            }
        }

        SubconjuntoResultado resultado = new SubconjuntoResultado(somaMaxima, posicaoMaximaInicial, posicaoMaximaFinal);
        return resultado;
    }
}
