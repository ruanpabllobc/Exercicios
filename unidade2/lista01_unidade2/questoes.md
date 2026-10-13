# Lista 01 — Unidade 2: Arrays, ArrayList e Herança

Regras gerais, válidas para todas as questões:

- Todos os atributos devem ser `private`.
- Crie getters apenas para os atributos simples (textos e números) e setters
  apenas quando algum método precisar alterar o atributo depois que o objeto
  foi criado.
- Não crie getters nem setters para arrays e listas: quem estiver fora da classe
  deve usar os métodos da própria classe (adicionar, remover, exibir...), e não
  mexer na coleção diretamente.
- Cada questão deve ter um método `main` que teste os métodos implementados.

As questões com mais de uma classe ficam em uma pasta própria (indicada com 📁),
e cada arquivo dessa pasta deve começar declarando o pacote com o nome da pasta
(ex.: `package agenda;`).

| Questões | Conteúdo |
|---|---|
| 1 a 4 | Arrays |
| 5 a 7 | ArrayList |
| 8 a 10 | Herança |

---

## Questão 1 — Números

Crie a classe `Numeros` com o atributo `valores` (`int[]`). O construtor deve
receber o array de valores.

Implemente os métodos:

- `exibir()`: exibe todos os valores do array, um por linha.
- `somar()`: retorna a soma de todos os valores do array.

No `main`, crie o array `{4, 8, 15, 16, 23, 42}`, passe-o para um objeto
`Numeros` e teste os dois métodos.

**Exemplo de saída:**

```
4
8
15
16
23
42
Soma: 108
```

---

## Questão 2 — Turma

Crie a classe `Turma` com os atributos `nomeDisciplina` (`String`) e `notas`
(`double[]`). O construtor deve receber o nome da disciplina e o array de notas.

Implemente os métodos:

- `calcularMedia()`: retorna a média das notas da turma.
- `contarAprovados()`: retorna quantos alunos tiveram nota maior ou igual a 7.

**Exemplo de saída:**

```
Disciplina: POO
Média da turma: 7.2
Aprovados: 3
```

---

## Questão 3 — Temperaturas

Crie a classe `Temperaturas` com os atributos `cidade` (`String`) e `valores`
(`double[]`), que guarda as temperaturas registradas em uma semana. O
construtor deve receber o nome da cidade e o array de temperaturas.

Implemente os métodos:

- `maiorTemperatura()`: retorna a maior temperatura do array.
- `menorTemperatura()`: retorna a menor temperatura do array.

> Dica: comece guardando o primeiro elemento do array (`valores[0]`) como
> maior (ou menor) e compare com os demais.

**Exemplo de saída:**

```
Cidade: Natal
Maior temperatura: 33.0
Menor temperatura: 24.5
```

---

## Questão 4 — Vetor (criando e preenchendo um array)

Crie a classe `Vetor` com o atributo `valores` (`int[]`). O construtor deve
receber o array de valores.

Implemente os métodos:

- `exibirInvertido()`: exibe os valores do último para o primeiro, um por linha.
- `contarPares()`: retorna quantos valores do array são pares.

No `main`, use a classe `Scanner` para perguntar ao usuário quantos valores ele
deseja digitar. Crie o array com esse tamanho usando `new int[quantidade]` e
preencha-o, posição por posição, com os valores lidos do teclado. Em seguida,
crie o objeto `Vetor` e teste os métodos.

> Dica: as posições de um array vão de `0` até `length - 1`. Tentar acessar uma
> posição fora desse intervalo (ex.: `valores[valores.length]`) gera o erro
> `ArrayIndexOutOfBoundsException`.

**Exemplo de execução:**

```
Quantos valores deseja digitar? 4
Digite o valor da posição 0: 7
Digite o valor da posição 1: 10
Digite o valor da posição 2: 3
Digite o valor da posição 3: 8
Valores em ordem inversa:
8
3
10
7
Quantidade de pares: 2
```

---

## Questão 5 — Lista de Números (de array para ArrayList)

Refaça a Questão 1 usando um `ArrayList` no lugar do array. Crie a classe
`ListaNumeros` com o atributo `valores` (`ArrayList<Integer>`). O construtor
não recebe parâmetros e deve inicializar a lista vazia.

Implemente os métodos:

- `adicionar(int valor)`: adiciona um valor à lista.
- `quantidade()`: retorna quantos valores há na lista.
- `exibir()`: exibe todos os valores, um por linha.
- `somar()`: retorna a soma de todos os valores.

No `main`, adicione os mesmos valores da Questão 1, exiba-os e mostre a soma.
Depois, adicione mais um valor (100) e mostre a nova quantidade e a nova soma.

Compare com o array da Questão 1:

| | Array | ArrayList |
|---|---|---|
| Tamanho | fixo, definido na criação | cresce e diminui conforme o uso |
| Criação | `new int[6]` ou `{4, 8, ...}` | `new ArrayList<>()` |
| Tamanho atual | `valores.length` | `valores.size()` |
| Ler a posição `i` | `valores[i]` | `valores.get(i)` |
| Adicionar | não é possível | `valores.add(x)` |

> Dica: o `ArrayList` só guarda objetos, por isso usamos `Integer` (e não
> `int`) entre `< >`. O Java converte automaticamente entre `int` e `Integer`.
> Não esqueça do `import java.util.ArrayList;`.

**Exemplo de saída:**

```
4
8
15
16
23
42
Soma: 108
Quantidade após adicionar o 100: 7
Nova soma: 208
```

---

## Questão 6 — Lista de Compras (métodos do ArrayList)

Crie a classe `ListaCompras` com o atributo `itens` (`ArrayList<String>`). O
construtor não recebe parâmetros e deve inicializar a lista vazia.

Implemente os métodos (entre parênteses, o método do `ArrayList` a usar):

- `adicionarItem(String item)`: adiciona um item à lista (`add`).
- `removerItem(String item)`: remove o item da lista, se ele existir (`remove`).
- `substituirItem(int posicao, String novoItem)`: troca o item da posição
  informada pelo novo item (`set`).
- `quantidadeItens()`: retorna quantos itens há na lista (`size`).
- `limpar()`: remove todos os itens da lista (`clear`).
- `exibir()`: exibe a posição e o nome de cada item (`size` e `get`). Se a
  lista estiver vazia, exibe `"Lista vazia"` (`isEmpty`).

No `main`, adicione "Arroz", "Feijão", "Café" e "Leite" e exiba a lista. Depois,
remova "Café", troque o item da posição 0 por "Arroz integral" e exiba de novo.
Por fim, limpe a lista e exiba mais uma vez.

> Observe que, ao remover "Café", os itens seguintes "andam" uma posição para
> trás: o "Leite", que estava na posição 3, passa para a posição 2.

**Exemplo de saída:**

```
0 - Arroz
1 - Feijão
2 - Café
3 - Leite
Total de itens: 4

0 - Arroz integral
1 - Feijão
2 - Leite
Total de itens: 3

Lista vazia
```

---

## Questão 7 — Agenda (ArrayList de objetos)

📁 Pasta: `agenda/`

Crie a classe `Contato` com os atributos `nome` (`String`) e `telefone`
(`String`) e sobrescreva o método `toString()`, retornando `"nome - telefone"`.

Em seguida, crie a classe `Agenda` com o atributo `contatos`
(`ArrayList<Contato>`). Implemente os métodos:

- `adicionarContato(Contato c)`: adiciona um contato à agenda.
- `listarContatos()`: exibe todos os contatos.
- `buscarPorNome(String nome)`: retorna o `Contato` com o nome informado, ou
  `null` se ele não existir.
- `exibirBusca(String nome)`: usa `buscarPorNome` e exibe o telefone do
  contato, ou a mensagem `"contato não encontrado"` se o retorno for `null`.
- `removerContato(String nome)`: usa `buscarPorNome` e, se encontrar o
  contato, remove-o da agenda; senão, exibe uma mensagem avisando.

> Dica: para percorrer a lista, você pode usar o *for-each*:
> `for (Contato c : contatos) { ... }` — lê-se "para cada contato `c` em
> `contatos`". Para comparar textos, use `equals`
> (ex.: `c.getNome().equals(nome)`).

No `main`, busque e remova um nome que existe e um que não existe.

**Exemplo de saída:**

```
Ana - (84) 99999-1111
Bruno - (84) 98888-2222
Carla - (84) 97777-3333

Busca por Bruno: (84) 98888-2222
Busca por Daniel: contato não encontrado

Bruno removido(a) da agenda
Daniel não está na agenda
Ana - (84) 99999-1111
Carla - (84) 97777-3333
```

---

## Questão 8 — Animais (Herança)

📁 Pasta: `animais/`

Crie a classe `Animal` com os atributos `nome` (`String`) e `idade` (`int`) e
os métodos:

- `emitirSom()`: exibe `"Som genérico"`.
- `toString()`: retorna `"nome - idade anos"`.

Crie as classes `Cachorro`, `Gato` e `Peixe`, que **herdam** de `Animal`
(`extends`). `Cachorro` e `Gato` devem **sobrescrever** (`@Override`) o
método `emitirSom()`:

- `Cachorro`: exibe `"<nome> diz: Au au!"`
- `Gato`: exibe `"<nome> diz: Miau!"`

O `Peixe` **não** sobrescreve nenhum método: ele só tem o construtor.

> Dica: o construtor da subclasse deve chamar o construtor da superclasse com
> `super(nome, idade)`.

Crie a classe `TesteAnimais` com o `main`, criando um animal de cada tipo e,
para cada um, exibindo o objeto (`toString`) e chamando `emitirSom()`.

> Repare que nenhuma subclasse escreveu o `toString()`, mas todas o têm: ele foi
> **herdado** de `Animal`. Já o `emitirSom()` foi **sobrescrito** no cachorro e
> no gato; o peixe usa a versão herdada.

**Exemplo de saída:**

```
Rex - 3 anos
Rex diz: Au au!
Mimi - 2 anos
Mimi diz: Miau!
Nemo - 2 anos
Som genérico
```

---

## Questão 9 — Veículos (Herança)

📁 Pasta: `veiculos/`

Crie a classe `Veiculo` com os atributos `marca` (`String`), `modelo`
(`String`) e `ano` (`int`) e sobrescreva o método `toString()`, retornando uma
`String` com esses dados.

Crie as subclasses:

- `Carro`, com o atributo extra `numeroPortas` (`int`).
- `Moto`, com o atributo extra `cilindradas` (`int`).

Cada subclasse também deve sobrescrever `toString()`, aproveitando o texto de
`super.toString()` e acrescentando o seu atributo extra.

> Dica: toda classe em Java herda, mesmo sem escrever `extends`, da classe
> `Object`, que já tem um método `toString()`. Por isso, em `Veiculo`, nós
> também estamos **sobrescrevendo** (`@Override`). O `System.out.println(objeto)`
> chama o `toString()` do objeto automaticamente. Use `"\n"` para quebrar a
> linha dentro da `String`.

Crie a classe `TesteVeiculos` com o `main` para testar as classes.

**Exemplo de saída:**

```
Marca: Fiat | Modelo: Argo | Ano: 2022
Portas: 4
Marca: Honda | Modelo: CG 160 | Ano: 2023
Cilindradas: 160
```

---

## Questão 10 — Folha de Pagamento (Herança + ArrayList)

📁 Pasta: `folha_pagamento/`

Crie a classe `Funcionario` com os atributos `nome` (`String`) e `salarioBase`
(`double`) e o método `calcularSalario()`, que retorna o salário base. Sobrescreva
também o `toString()`, retornando `"nome: R$ salário"` (use `calcularSalario()`
para obter o salário).

Crie a subclasse `Gerente`, com o atributo extra `bonus` (`double`), que
sobrescreve `calcularSalario()` retornando o salário base **mais** o bônus.
Assim como `Carro` e `Moto` na Questão 9, o `Gerente` também deve sobrescrever
`toString()`, aproveitando o texto de `super.toString()` e acrescentando o seu
atributo extra.

Crie a classe `FolhaPagamento` com o `main`. Nele, crie um
`ArrayList<Funcionario>` e adicione dois funcionários e um gerente. Em
seguida, percorra a lista exibindo cada funcionário (`toString`) e, ao final,
o total da folha.

> Observe que um `Gerente` pode ser guardado em um `ArrayList<Funcionario>`,
> pois todo gerente **é um** funcionário. Ao chamar `calcularSalario()`, o Java
> executa a versão correta de cada objeto (polimorfismo). Por isso o salário
> da Carla já aparece com o bônus somado.

**Exemplo de saída:**

```
Ana: R$ 3000.0
Bruno: R$ 2500.0
Carla: R$ 7000.0
Bônus: R$ 2000.0
Total da folha: R$ 12500.0
```
