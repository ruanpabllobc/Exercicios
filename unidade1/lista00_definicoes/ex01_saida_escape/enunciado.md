# Exercício 01 — Saída de Dados e Sequências de Escape

## Enunciado

Escreva um programa em Java, na classe `Main`, que demonstre o uso dos métodos
de saída `System.out.println` e `System.out.print`, evidenciando a diferença
de comportamento entre eles (quebra de linha automática ou não).

Em seguida, utilize sequências de escape para exibir corretamente:

- Um texto que ocupe duas linhas, usando a quebra de linha (`\n`);
- Um texto com espaçamento em formato de tabela, usando tabulação (`\t`);
- Uma frase que contenha aspas duplas dentro do próprio texto (`\"`);
- Um caminho de arquivo do Windows, contendo barras invertidas (`\\`).

## Pedido

> Crie uma classe `Main` com um método `main`. Utilizando apenas comandos de
> impressão (`print`/`println`) e sequências de escape, produza uma saída no
> console que:
>
> 1. Exiba a frase `"Ola, turma!"` seguida de quebra de linha;
> 2. Exiba `"Isso fica na mesma linha."` construída a partir de três chamadas
>    a `print`/`println` diferentes, sem quebra de linha entre elas;
> 3. Exiba um texto de duas linhas usando `\n`;
> 4. Exiba `"Nome:"` e `"Idade:"` separados por tabulação;
> 5. Exiba uma frase contendo aspas duplas internas;
> 6. Exiba um caminho de arquivo do tipo `C:\Users\aluno`.

## Saída esperada

```
Ola, turma!
Isso fica na mesma linha.
Linha 1
Linha 2
Nome:	Idade:
Ela disse: "Java e legal"
Caminho: C:\Users\aluno
```
