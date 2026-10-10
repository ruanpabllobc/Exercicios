# Lista 01 — Unidade 2: Arrays

Em todas as questões, os atributos devem ser `private` e acessados por meio de
getters/setters quando necessário. Cada classe deve ter um método `main` que
teste os métodos implementados.

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
