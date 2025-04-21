package br.com.alura.polimorfism.models;

public class Serie extends Title {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoLancamento, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nome, anoLancamento);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int calcularTempo() {
        // A série tem o tempo de exibição calculado com base no número de temporadas, episódios por temporada e minutos por episódio
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
    }
}



