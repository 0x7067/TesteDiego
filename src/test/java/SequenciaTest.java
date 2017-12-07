import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe com os testes da classe Sequencia
 * @author pedroguimaraes
 */
public class SequenciaTest {
    /**
     * Dada uma palavra com todos os caracteres iguais retornar o caractere e o tamanho da palavra
     */
    @Test
    public void testaStringComCaracteresIguais() {
        final String palavra = "aaaaa";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);

        assertEquals("a", resultado.getCharRepetido());
        assertEquals(5, resultado.getNumeroRepeticoes());
    }

    /**
     * Dada uma palavra com sequencias de repetição de mesmo tamanho retornar o primeiro caractere que forma a primeira sequencia
     */
    @Test
    public void testaStringComSequenciasDeMesmoTamanho() {
        final String palavra = "aabbccddee";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);
        assertEquals("a", resultado.getCharRepetido());
        assertEquals(2, resultado.getNumeroRepeticoes());
    }

    /**
     * Dada uma palavra com caracteres em upperCase, converter todos os caracteres para lowerCase e encontrar a sequencia
     */
    @Test
    public void testaStringComCaracterUpperCase() {
        final String palavra = "PressAaaaAo";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);
        assertEquals("a", resultado.getCharRepetido());
        assertEquals(5, resultado.getNumeroRepeticoes());
    }

    /**
     * Dada uma palavra qualquer retornar a maior sequencia de caracteres repetidos
     */
    @Test
    public void testaStringNormal() {
        final String palavra = "Pressaaao";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);
        assertEquals("a", resultado.getCharRepetido());
        assertEquals(3, resultado.getNumeroRepeticoes());
    }

    /**
     * Dada uma string alfanumerica retornar a maior sequencia de caracteres repetidos
     */
    @Test
    public void testaStringAlfanumerica() {
        final String palavra = "hheeellllooo11111111111wooooorlddd333444";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);
        assertEquals("1", resultado.getCharRepetido());
        assertEquals(11, resultado.getNumeroRepeticoes());
    }

    /**
     * Dada uma string vazia retornar null
     */
    @Test
    public void testaStringVazia() {
        final String palavra = "";
        SequenciaResultado resultado = Sequencia.procuraMaiorSequenciaIgual(palavra);
        assertEquals(null, resultado.getCharRepetido());
        assertEquals(0, resultado.getNumeroRepeticoes());
    }
}
