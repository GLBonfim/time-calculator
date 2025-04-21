
# Projeto: Calculadora de Tempo de Exibição

Este é um projeto simples em Java que utiliza conceitos de **herança** e **polimorfismo** para calcular o tempo de exibição de séries e títulos. O projeto consiste em três classes principais: `Titulo`, `Serie`, e `CalculadoraDeTempo`.

## Funcionalidade

- A classe `Titulo` representa um título genérico (como um filme ou série).
- A classe `Serie` herda de `Titulo` e adiciona funcionalidades específicas para séries, como número de temporadas, episódios por temporada e minutos por episódio.
- A classe `CalculadoraDeTempo` permite calcular o tempo total de exibição de um título, seja ele genérico ou uma série, utilizando o polimorfismo.

## Estrutura do Projeto

1. **Classe `Titulo`**:
    - Contém os atributos básicos de um título, como `nome` e `anoLancamento`.
    - Contém um método `calcularTempo()`, que retorna 0 para um título genérico.

2. **Classe `Serie`** (herda de `Titulo`):
    - Extende `Titulo` e adiciona os atributos: `temporadas`, `episodiosPorTemporada`, e `minutosPorEpisodio`.
    - Sobrescreve o método `calcularTempo()`, calculando o tempo total de exibição com base nesses atributos.
    
3. **Classe `CalculadoraDeTempo`**:
    - Recebe um objeto do tipo `Titulo` e chama o método `calcularTempo()` para calcular o tempo de exibição, utilizando o conceito de polimorfismo.

## Como Usar

1. **Clone o repositório**:
   Se você ainda não fez isso, clone o repositório com o seguinte comando:

   ```bash
   git clone https://github.com/GLBonfim/calculadora-tempo.git
   ```

2. **Compilação e Execução**:
    - Compile e execute as classes Java utilizando a sua IDE de preferência (IntelliJ IDEA, Eclipse, etc.).
    - Ou, utilize o terminal:
        - Para compilar:

          ```bash
          javac Titulo.java Serie.java CalculadoraDeTempo.java Main.java
          ```

        - Para rodar o programa:

          ```bash
          java Main
          ```

## Exemplo de Saída

Ao rodar o programa, a saída será:

```
Título: Breaking Bad | Ano de Lançamento: 2008
Temporadas: 5 | Episódios por temporada: 13 | Minutos por episódio: 47
Tempo total de exibição para Breaking Bad: 3055 minutos.
Título: O Senhor dos Anéis | Ano de Lançamento: 2001
Tempo total de exibição para O Senhor dos Anéis: 0 minutos.
```

## Licença

Este projeto é de código aberto e licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
