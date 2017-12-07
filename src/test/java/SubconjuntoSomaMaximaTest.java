import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Testes da classe SubconjuntoSomaMaxima
 * @author pedroguimaraes
 *
 */
public class SubconjuntoSomaMaximaTest {

    /**
     * Dado um array contendo apenas números positivos retornar a soma de todos os elementos
     */
    @Test
    public void testaConjuntoSomenteNumerosPositivos() {
        final int[] conjuntoInicial = {2, 4, 6, 8, 10, 100, 6, 5};
        SubconjuntoResultado resultado = SubconjuntoSomaMaxima.procuraMaiorSubconjunto(conjuntoInicial);
        assertEquals(0, resultado.getPosicaoInicial());
        assertEquals(7, resultado.getPosicaoFinal());
        assertEquals(141, resultado.getSomaMaxima());
    }

    /**
     * Dado um array contendo apenas números negativos retornar o maior elemento
     */
    @Test public void testaConjuntoSomenteNumerosNegativos() {
        final int[] conjuntoInicial = {-3, -2, -4, -6, -8, -10, -100, -6, -5};
        SubconjuntoResultado resultado = SubconjuntoSomaMaxima.procuraMaiorSubconjunto(conjuntoInicial);
        assertEquals(1, resultado.getPosicaoInicial());
        assertEquals(1, resultado.getPosicaoFinal());
        assertEquals(-2, resultado.getSomaMaxima());
    }

    /**
     * Dado um array contendo números negativos e positivos retornar o subconjunto com maior soma
     */
    @Test public void testaConjuntoNumerosNegativosEPositivos() {
        final int[] conjuntoInicial = {2, -4, 6, 8, -10, 100, -6, 5};
        SubconjuntoResultado resultado = SubconjuntoSomaMaxima.procuraMaiorSubconjunto(conjuntoInicial);
        assertEquals(2, resultado.getPosicaoInicial());
        assertEquals(5, resultado.getPosicaoFinal());
        assertEquals(104, resultado.getSomaMaxima());
    }

    /**
     * Dado um array vazio retornar uma resposta nula (todos os elementos setados em 0)
     */
    @Test public void testaConjuntoVazio() {
        final int[] conjuntoInicial = {};
        SubconjuntoResultado resultado = SubconjuntoSomaMaxima.procuraMaiorSubconjunto(conjuntoInicial);
        assertEquals(0, resultado.getPosicaoInicial());
        assertEquals(0, resultado.getPosicaoFinal());
        assertEquals(0, resultado.getSomaMaxima());
    }
}
