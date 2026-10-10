# Exercício 11 — Soma com Sentinela (while)

## Enunciado

Escreva um programa em Java que leia vários números inteiros digitados pelo
usuário, um de cada vez, e some todos eles. A leitura deve continuar
**enquanto** o usuário não digitar `0`. O valor `0` funciona como uma
**sentinela**: serve apenas para encerrar a repetição e não entra na soma.

Ao final, o programa deve exibir quantos números foram somados e o total.

## Pedido

> Utilizando `Scanner` e uma estrutura `while`:
>
> 1. Leia um primeiro número inteiro antes do laço;
> 2. Enquanto o número lido for diferente de `0`, acumule-o em `soma`,
>    incremente um contador `quantidade` e leia o próximo número;
> 3. Quando o usuário digitar `0`, saia do laço e exiba:
>    `"Quantidade de numeros somados: <quantidade>"` e
>    `"Soma total: <soma>"`.
>
> Repare que no `while` a condição é testada **antes** de cada volta: se o
> primeiro valor digitado já for `0`, o corpo do laço não executa nenhuma vez
> (quantidade e soma continuam `0`).

## Exemplo de execução

```
Digite um numero (0 para encerrar): 10
Digite um numero (0 para encerrar): 5
Digite um numero (0 para encerrar): 8
Digite um numero (0 para encerrar): 0
Quantidade de numeros somados: 3
Soma total: 23
```
