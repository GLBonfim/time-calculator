package br.com.alura.polimorfism.models;

public class Title {
    protected String nome;
    protected int anoLancamento;

    public Title(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    // Método para calcular o tempo de exibição, mas a implementação será específica nas subclasses
    public int calcularTempo() {
        return 0; // Retorna 0 para um título genérico (sem implementação específica)
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
}

