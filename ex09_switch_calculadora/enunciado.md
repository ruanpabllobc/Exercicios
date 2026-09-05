# Exercício 09 — Calculadora com Menu (switch)

## Enunciado

Escreva um programa em Java que funcione como uma **calculadora simples**.
O usuário informa dois números e escolhe, através de um **menu numerado**,
qual operação deseja realizar. A seleção da operação deve ser feita com
`switch`.

## Pedido

> Utilizando `Scanner`, leia dois números `double` `a` e `b`. Exiba um menu
> com as opções:
>
> ```
> 1 - Somar
> 2 - Subtrair
> 3 - Multiplicar
> 4 - Dividir
> ```
>
> Leia um `int opcao` e use `switch (opcao)` para calcular e exibir
> `"Resultado: <valor>"`. Trate dois casos especiais:
>
> - divisão por zero (opção 4 com `b == 0`) deve exibir `"Erro: divisao por zero"`;
> - qualquer opção fora de 1–4 cai no `default` e exibe `"Opcao invalida"`.
>
> Repare por que o `switch` é natural aqui e foi forçado no Exercício 07:
> agora existe **uma única variável** (`opcao`) com um **conjunto finito de
> valores discretos** (1, 2, 3, 4). É exatamente o cenário para o qual o
> `switch` foi feito — um ramo por valor, sem faixas nem combinação de
> condições.

## Exemplo de execução

```
a: 10
b: 4
Escolha a operacao:
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
Opcao: 3
Resultado: 40.0
```
