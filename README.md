# Imersão Java
![status de desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)

## Índice

* [Aula 01](https://github.com/LevoratoJoao/Imersao-Java/tree/aula01)
* [Aula 02](https://github.com/LevoratoJoao/Imersao-Java/tree/aula02)
* [Aula 03](https://github.com/LevoratoJoao/Imersao-Java/tree/aula03)
* [Aula 04](https://github.com/LevoratoJoao/Imersao-Java/tree/aula04)
* [Aula 05](https://github.com/LevoratoJoao/Imersao-Java/tree/aula05)
* [Projeto finalizado](https://github.com/LevoratoJoao/Imersao-Java/tree/main)

# Descrição o projeto
Projeto desenvolvido durante a imersão Java - Alura.

**alura-stickers:** aplicação criada para consumir os dados de uma API de imagens e gerar figurinhas. Os dados são extraidos atráves do json das APIs, apartir disso é realizado a leitura das imagens e realizamos as devidas edições nela assim como na frase escrita (tamanho, fonte, transparencia, etc...).

**linguagens-api**: [levorato-linguagens-api.herokuapp.com/linguagens](https://levorato-linguagens-api.herokuapp.com/linguagens)

A API irá retornar o que esta armazenados no banco de dados em formato de um arquivo json como mostrado no exemplo abaixo:

![HTTP-GET na API](https://user-images.githubusercontent.com/90461798/180868972-c840ffcc-7039-40e7-840c-5e080cef6595.png)

Atráves do Postman podemos utilizar metodo GET e POST para visualizar os dados na API e adicionar

![Metodo GET no Postman](https://user-images.githubusercontent.com/90461798/180898360-48083a02-b4e3-4dbd-85c5-3341edbd778e.png)

![Metodo POST no Postman](https://user-images.githubusercontent.com/90461798/180898808-656d0cab-fca1-4b15-b2e0-56ebad704135.png)

Para o banco de dados utilizamos o [MongoDB](https://cloud.mongodb.com/v2/62ddbad51e63e5442419d496#clusters) que é um cluster de servidores que tem banco de dados. Nele podemos adicionar, deletar e alterar itens na nossa base de dados.
A conexão está presente na [linguagens-api](https://github.com/LevoratoJoao/Imersao-Java/blob/main/linguagens-api/src/main/resources/application.properties) basta substituir os campos das ```<>``` pela suas informações de conexão do MongoDB.

| Vitrine.dev |                                                          |
| ----------- | -------------------------------------------------------- |
| Nome        | Imaersão Java                                            |
| Tecnologias | Java, MongoDB, Heroku, Spring                            |
| URL         | https://levorato-linguagens-api.herokuapp.com/linguagens |
| Desafio     | https://www.alura.com.br/imersao-java                    |


# Aula 01
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
* Apêndice da apostila [Java e Orientação a Objetos](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.

# Aula 03
Nesta aula o código foi refatorado e estruturado em orientação a objtos para assim facilitar o entendimento e de uma maneira que facilitasse o consumo e uma API diferente

## Desafios
1. [ ] 1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
2. [ ] 2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
3. [ ] 3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
4. [ ] 4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
5. [ ] 5. **Desafio supremo:** consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. [Repositório com APIs públicas](https://github.com/public-apis/public-apis).

## Links
* Artigo na Alura “[Como não aprender Java e Orientação a Objetos: getters e setters](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters)”.
* Artigo na Alura “[Como não aprender Java e Orientação a Objetos: herança](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca)”.
* Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453).
* Podcast Hipsters.tech sobre [Design Patterns]().
* Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649).

# Aula 04
Na quarta aula construimos uma API REST para expor nosso próprio conteúdo, no caso este conteúdo será de linguagens de programação, utilizando ferramentas como o Spring Framework e um banco de dados NoSQL.

<!-- Explicação - Spring Framework -->

Para acessar o banco de dados entre com uma conta no MongoDb e crie um novo projeto, após criar um novo projeto clique em ```"Connect" -> "Connect your application"``` para gerar um connection string.

No projeto acesse:
```
Imersao-Java\linguagens-api\src\main\resources\application.properties
```
e subistitua a conexão:
```
spring.data.mongodb.uri = mongodb+srv://<usuario>:<senha>@cluster0.z5v5s.mongodb.net/<nomeDb>?retryWrites=true&w=majority
```
<!-- Explicação - Postman -->

# Desafios
1. [ ] 1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
2. [ ] 2. Devolver a listagem ordenada pelo ranking;
3. [ ] 3. Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
4. [ ] 4. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
5. [ ] 5. **Desafio supremo**: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

# Links
* [Documentação do Spring Framework](https://spring.io).
* [Iniciar um projeto utilizando Spring](https://start.spring.io).
* [download do Maven](https://maven.apache.org/download.cgi).
* [download do Postman](https://www.postman.com).
* Página para fazer o [registro e começar a utilizar o MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register).
* GitHub com os [logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos).
* Primeira aula do curso [“Maven: gerenciamento de dependências e build de aplicações Java”](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java) da Alura.
* Alura+ [“O que é REST?”](https://www.youtube.com/watch?v=weQ8ssA6iBU).
* Artigo da Alura [“Conceito e fundamentos sobre REST”](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos).
* Podcast [Hipsters.Tech sobre MongoDB](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/).
* Hipters.Tube [“O que é SQL e NoSQL?”](https://www.youtube.com/watch?v=aure5d3B88g).
* Artigo da Alura [“Spring: Conheça esse framework Java”](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java).
* Alura+ [Introdução ao Postman](https://www.youtube.com/watch?v=op81bMbgZXs).

# Aula 05

Na aula 05 tornamos a aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem da plataforma Heroku. Além de gerar figurinhas a partir do conteúdo dessa nossa API.

Para fazer um deploy no Heroku precisamos ter nosso projeto em um repositório Git e criar uma nova aplicação na plataforma e depois seguir os seguintes passos:

Crie um arquivo dentro da pasta ```linguagens-api``` chamado ```system.properties``` e digite:
```
java.runtime.version=17
```
Depois digite os comanos no terminal:
```
$ heroku login
$ heroku git:remote -a <nome-da-aplicacao>
$ git push heroku main
```
Caso já tenha um repositório com seu projeto e sua API está presente neste repositório execute o seguinte comando para o push:
```
git subtree push --prefix linguagens-api heroku main
```

Também é possivel rodar a aplicação da seguinte forma mas é necessário ter o Java instalado em sua máquina:
o framework Spring já nos traz um arquivo mvnw que nada mais é que um script e para executalo basta rodar o comando
```
./mvnw package
```
isso irá criar um arquivo que está dentro da pasta ```linguagens-api/target``` e terá o arquivo .jar ```linguagens-api-0.0.1-SNAPSHOT.jar```, execute o comando para rodar a aplicação
```
java -jar linguagens-api-0.0.1-SNAPSHOT.jar
```


## Desafios
1. [x] 1. Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);
2. [ ] 2. Colocar a aplicação no cloud da Oracle;
3. [ ] 3. Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;
4. [ ] 4. **Desafio supremo**: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;

## Links
* [Dev em T: especialista x generalista](https://www.alura.com.br/dev-em-t).
* Site do [Heroku](https://dashboard.heroku.com/apps), que é um PaaS (plataforma como serviço).
* Documentação sobre a [Oracle Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm).
* Artigo da Alura [“Heroku, Vercel e outras opções de Cloud como plataforma”](https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma).
* Podcast Hipters.Tech [“Integração Contínua, Deploy Contínuo e Github Actions”](https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335).
* Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, [sobre o ecossistema Java em 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/).
