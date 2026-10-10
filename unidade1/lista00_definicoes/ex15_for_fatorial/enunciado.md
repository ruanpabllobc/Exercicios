# Exercício 15 — Fatorial (for) — nível médio

## Enunciado

Escreva um programa em Java que leia um número inteiro não negativo `n` e
calcule o seu **fatorial** (`n!`), usando uma estrutura de repetição `for`.

Lembre-se de que:

- `n! = 1 x 2 x 3 x ... x n`;
- `0! = 1` e `1! = 1` (casos especiais que devem funcionar sem tratamento
  extra se o acumulador começar em `1`);
- não existe fatorial de número negativo.

## Pedido

> Utilizando `Scanner`, leia um `int n`. Se `n < 0`, exiba
> `"Nao existe fatorial de numero negativo."` e encerre. Caso contrário,
> crie `long fatorial = 1` e, num laço `for (int i = 2; i <= n; i++)`, faça
> `fatorial *= i`. Ao final, exiba `"<n>! = <fatorial>"`.
>
> Use `long` em vez de `int` porque o fatorial cresce muito rápido: `13!` já
> passa do limite de um `int`.
>
> Compare com o Exercício 14: lá o acumulador somava e começava em `0`; aqui
> ele multiplica e começa em `1`.

## Exemplo de execução

```
Digite um numero inteiro nao negativo: 5
5! = 120
```
