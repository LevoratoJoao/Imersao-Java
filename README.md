# Imersão Java
[![status de desenvolvimento](https://img.shields.io/badge/STATUS-Em_desenvolvimento-ansicolortags.svg)](https://shields.io/)

## Índice

* [Descrição o projeto](#Descrição-o-projeto)
* [Aula 01](https://github.com/LevoratoJoao/Imersao-Java/tree/aula01)
* [Aula 02](https://github.com/LevoratoJoao/Imersao-Java/tree/aula02)
* [Aula 03](https://github.com/LevoratoJoao/Imersao-Java/tree/aula03)
* [Aula 04](#Aula-04)
* [Projeto finalizado](https://github.com/LevoratoJoao/Imersao-Java/tree/main)

# Descrição o projeto
Projeto desenvolvido durante a imersão Java - Alura.

## APIs usadas
* (https://api.mocki.io/v2/549a5d8b/Top250Movies)
* (https://api.mocki.io/v2/549a5d8b/MostPopularMovies)
* (https://api.mocki.io/v2/549a5d8b/MostPopularTVs)
* (https://api.mocki.io/v2/549a5d8b/Top250TVs)
* (https://api.mocki.io/v2/549a5d8b/NASA-APOD)

<!-- # Aula 01
Durante a aula 01 foi contruido uma aplicação para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação.
## Desafios
  1. [ ] 1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
  2. [ ] 2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
  3. [ ] 3. Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
  4. [ ] 4. Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
  5. [ ] 5. **Desafio supremo**: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.
  
## Links
* Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
* [Biblioteca Jackson, que faz parse de JSON](https://github.com/FasterXML/jackson).
* Site para [Expressões Regulares](https://regex101.com).
* Artigo: [README](https://www.alura.com.br/artigos/escrever-bom-readme).
* Artigo: [O que é json](https://www.alura.com.br/artigos/o-que-e-json).
* Artigo: [Cores no terminal](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis).
* Artigo: [VS Code para Java](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code).

# Aula 02
Na segunda aula foi criado um gerador de figurinhas explorando outras bibliotecas nativas do Java

## Desafios
  1. [ ] 1. Ler a documentação da classe abstrata InputStream.
  2. [ ] 2. Centralizar o texto na figurinha.
  3. [x] 3. Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
  4. [x] 4. Criar diretório de saída das imagens, se ainda não existir.
  5. [ ] 5. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
  6. [ ] 6. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
  7. [ ] 7. Colocar contorno (outline) no texto da imagem.
  8. [ ] 8. Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
  9. [ ] 9. Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
  10. [ ] 10. **Desafio supremo:** usar alguma biblioteca de manipulação de imagens como [OpenCV](https://github.com/opencv-java) pra extrair imagem principal e contorná-la.

## Links

* Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.
* Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java
* Documentação da classe [Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
* Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.
* [Java Polimorfismo: entenda herança e interfaces](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo).
* Apêndice da apostila [Java e Orientação a Objetos](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream. -->

# Aula 03

Nesta aula o código foi refatorado e estruturado em orientação a objtos para assim facilitar o entendimento e de uma maneira que facilitasse o consumo e uma API diferente

## Desafios

1. [ ] 1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
2. [ ] 2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
3. [ ] 3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
4. [ ] 4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
5. [ ]5. **Desafio supremo:** consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. [Repositório com APIs públicas](https://github.com/public-apis/public-apis).

## Links

* Artigo na Alura “[Como não aprender Java e Orientação a Objetos: getters e setters](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters)”.
* Artigo na Alura “[Como não aprender Java e Orientação a Objetos: herança](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca)”.
* Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453).
* Podcast Hipsters.tech sobre [Design Patterns]().
* Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649).

