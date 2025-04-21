import br.com.alura.polimorfism.models.Serie;
import br.com.alura.polimorfism.models.TimeCalculator;
import br.com.alura.polimorfism.models.Title;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto de Serie
        Serie minhaSerie = new Serie("Breaking Bad", 2008, 5, 13, 47);
        minhaSerie.exibirDetalhes();

        // Calculando o tempo de exibição da série
        TimeCalculator.calcularTempoExibicao(minhaSerie);

        // Criando um objeto de Titulo genérico
        Title tituloGenerico = new Title("O Senhor dos Anéis", 2001);
        tituloGenerico.exibirDetalhes();

        // Tentando calcular o tempo de exibição de um Titulo genérico
        TimeCalculator.calcularTempoExibicao(tituloGenerico);
    }
}
