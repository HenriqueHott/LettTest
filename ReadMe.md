# LettTest

Repositório criado para o teste seletivo de estágio Java (Crawler e Data quality) da LettDigital.

## Questão 1 - Solução para representação dos animais de uma fazenda

A solução se encontra em `./question1`. Para solução foi implementado uma super classe `Animal` que contém as características comuns entre todos os animais e delega as subclasses a implementação da interface para emissão de som. As subclasses abstratas `Mammal` e `Bird` definem as características específicas dos tipos de animais da fazenda e delega as subclasses concretas a implementação da interface e características específicas de cada animal.

Para **compilar** e **executar** o programa utilize os seguintes comandos:

```
./seu/dir/lettTest/question1 javac ./animals/*.java
./seu/dir/lettTest/question1 javac Main.java

/seu/dir/lettTest/question1 java Main
```

### Entrada:

A entrada do programa pode conter várias linhas. Cada linha contém os dados de um animal todos separados por espaço na seguinte ordem: Tipo do animal (em loweCase), peso, altura, cor do pelo (ou cor da pena) e a distancia de voo (caso o animal possa voar). O processo de leitura é encerrado quando uma linha contendo apenas o caractere **0** é lido. A leitura é realizada atráves da entrada padrão (`System.in`).

Exemplo de entrada:

```
cow 12 44.5 verde
duck 12 44.5 verde 17.5
chicken 12 44.5 amarelinho
bat 7 85.1 verde 14.7
0
```

### Saída:

A saída será listagem dos animais da fazenda descritos um por linha. A saída é realizada pela saída padrão (`System.out`).

Exemplo de saída:

```
{ Cow Age: 12, Height: 44.5, FurColor: verde Muuuuuu }
{ Duck Age:12, Height:12, FeatherColor: verde, FlightDistance: 17.5 Qua Qua Qua Qua }
{ Chiken Age:12, Height:12, FeatherColor: amarelinho Carico Caricoooo Caricooo }
{ Bat Age: 7, Height: 85.1, FurColor: verdeFlyDistance: 14.7 Muuuuuu }
```

## Questão 2 - WebScrapper MercadoLivre

Solução para criação de um WebScapper para palataforma de E-Commerce [MercadoLivre](https://ofertas.mercadolivre.com.br/recebaemcasa#DEAL_ID=MLB2367&S=landingHubrecebaemcasa&V=0&T=MainSliderItem-normal&L=HEADER_1&deal_print_id=b8f6ddc0-7037-11ea-b513-c941a6ceb129). Foi utilizado a biblioteca [JSoup](https://jsoup.org/) para busca e parse das paginas dos produtos.

Para cada página de produto buscada as seguintes informações são retornadas: Nome, preço, disponibilidade, features (caso houver), descrição e a tabela de características do produto (caso houver). Se um elemento não for encontrado irá ser retornado apenas `"NOT FOUND"`.

Para **compilar** e **executar** o programa utilize os seguintes comandos:

```
./seu/dir/lettTest/question2 javac Main.java
./seu/dir/lettTest/question2 java Main
```

### Entrada:

A entrada do programa pode conter várias linhas. Cada linha de entrada deve conter a URL de algum produto da plataforma. As linhas da entrada são lidas uma a uma pela entrada padrão (`System.in`). A leitura da entrada é encerrada quando for lida uma linha contendo apenas o caractere **0**.

**OBS: Maioria dos meus testes foram utilizando páginas de [celulares]("https://celulares.mercadolivre.com.br/#menu=categories") e lembrando que a plataforma contém uma grande gama de layouts de páginas de produtos. Hehehe ;(**

Exemplo de entrada:

```
https://urlPaginaDoProduto.com.br
bananinha <-- Sou uma URL inválida
0
```

### Saída:

A saída representa a lista dos dados dos produtos encontrados e é realizada pela saída padrão (`System.out`).

Exemplo de saída:

```
=======================================================
NOME
Price: Preço (% de desconto se houver)
Availaibility: Status do produto no estoque

Features List:
Features1 - Festure2 - ... -

Description:
Texto de descição

Attributes Table:
NomeDoAtributo1: Texto - NomeDoAtributo1: Texto - ... -
========================================================
URL inválida

```

## Contato

Qualquer coisa pode me chamar no discord ou mesmo mandar um email fica ao seu critério :)

-   Discord: reaborn#8454
-   Email: henrique.hott1996@gmail.com
