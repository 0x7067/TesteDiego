/**
 * Dada uma palavra essa classe retorna a maior sequencia de caracteres repetidos encontrada na palavra
 * @author pedroguimaraes
 *
 */
public class Sequencia {

    public static void main(String[] args) {
        SequenciaResultado resultado = procuraMaiorSequenciaIgual("Pressaaao");
        System.out.println(resultado.toString());
    }

    /**
     * @param palavra
     * Dada uma palavra procura sequencias de caracteres repetidos
     * caso todas as sequencias tenham tamanhos iguais retorna a primeira sequencia encontrada
     * @return sequencia com maior número de caracteres repetidos
     */
    public static SequenciaResultado procuraMaiorSequenciaIgual(String palavra) {
        // retorna null em caso de palavra vazia
        if(palavra.length() == 0) {
            return new SequenciaResultado(null, 0);
        }

        // garante que a palavra pode ser avaliada independemente de alguns caracteres estarem em upperCase
        palavra = palavra.toLowerCase();

        int sequenciaMaximaTemporaria = 1;
        int sequenciaMaxima = 0;
        char charSequencia = 0;

        for(int i = 1; i < palavra.length(); i++) {
            if(palavra.charAt(i) == palavra.charAt(i - 1)) {
                sequenciaMaximaTemporaria++;
            } else {
                if(sequenciaMaximaTemporaria > sequenciaMaxima) {
                    sequenciaMaxima = sequenciaMaximaTemporaria;
                    charSequencia = palavra.charAt(i - 1);
                }
                sequenciaMaximaTemporaria = 1;
            }
        }
        if(sequenciaMaximaTemporaria > sequenciaMaxima) {
            sequenciaMaxima = sequenciaMaximaTemporaria;
            charSequencia = palavra.charAt(palavra.length() - 1);
        }

        SequenciaResultado resultado = new SequenciaResultado(String.valueOf(charSequencia), sequenciaMaxima);
        return resultado;
    }
}