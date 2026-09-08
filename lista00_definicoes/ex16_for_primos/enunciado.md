# Exercício 16 — Números Primos até N (for aninhado) — nível médio

## Enunciado

Escreva um programa em Java que leia um número inteiro `n` e exiba todos os
**números primos** de `2` até `n`. Um número é primo quando é maior que `1`
e só é divisível por `1` e por ele mesmo.

A solução usa **dois `for` aninhados**: o laço externo percorre cada
candidato; o laço interno procura um divisor para esse candidato.

## Pedido

> Utilizando `Scanner`, leia um `int n`. Para cada `num` de `2` até `n`
> (laço externo):
>
> 1. Assuma `boolean primo = true`;
> 2. Num laço interno `for (int div = 2; div < num; div++)`, se
>    `num % div == 0`, marque `primo = false` e use `break` para parar de
>    testar (já achou um divisor);
> 3. Depois do laço interno, se `primo` continuar `true`, imprima `num`.
>
> Ao final, exiba todos os primos encontrados na mesma linha, separados por
> espaço. O `break` é uma otimização: assim que um divisor aparece, não faz
> sentido continuar procurando.

## Exemplo de execução

```
Listar primos ate: 20
Numeros primos de 2 ate 20:
2 3 5 7 11 13 17 19 
```
