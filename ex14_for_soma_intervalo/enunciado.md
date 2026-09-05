# Exercício 14 — Soma de um Intervalo (for) — nível fácil

## Enunciado

Escreva um programa em Java que leia dois números inteiros `a` e `b`
(considere `a <= b`) e calcule a **soma de todos os inteiros** de `a` até
`b`, incluindo os dois extremos. Use uma estrutura de repetição `for` com
uma variável **acumuladora**.

## Pedido

> Utilizando `Scanner`, leia `int a` e `int b`. Crie uma variável
> `int soma = 0` e, num laço `for (int i = a; i <= b; i++)`, faça
> `soma += i`. Ao final, exiba
> `"Soma dos inteiros de <a> ate <b> = <soma>"`.
>
> O acumulador precisa ser inicializado com `0` (elemento neutro da soma)
> **antes** do laço; a cada volta ele recebe seu valor anterior mais `i`.

## Exemplo de execução

```
Inicio do intervalo (A): 1
Fim do intervalo (B): 5
Soma dos inteiros de 1 ate 5 = 15
```
