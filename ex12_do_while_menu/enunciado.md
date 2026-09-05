# Exercício 12 — Menu que Repete (do / while)

## Enunciado

Escreva um programa em Java que exiba um **menu de opções** e execute a ação
escolhida pelo usuário. Depois de cada ação, o menu deve ser mostrado
novamente, **repetindo até** que o usuário escolha a opção `0 - Sair`.

Como o menu precisa aparecer **pelo menos uma vez** antes de qualquer teste,
a estrutura natural é o `do / while`.

## Pedido

> Utilizando `Scanner` e uma estrutura `do / while`, monte um laço que:
>
> 1. Exiba o menu:
>    ```
>    1 - Dizer ola
>    2 - Mostrar uma dica
>    0 - Sair
>    ```
> 2. Leia um `int opcao`;
> 3. Com `if / else if / else`, execute a ação correspondente
>    (mensagem para 1 e 2, `"Saindo..."` para 0, `"Opcao invalida."` para
>    qualquer outro valor);
> 4. Repita **enquanto** `opcao != 0`.
>
> Compare com o Exercício 11: no `while` a condição é testada no início;
> no `do / while` ela é testada no fim, então o corpo sempre roda ao menos
> uma vez.

## Exemplo de execução

```
=== MENU ===
1 - Dizer ola
2 - Mostrar uma dica
0 - Sair
Opcao: 1
>> Ola!

=== MENU ===
1 - Dizer ola
2 - Mostrar uma dica
0 - Sair
Opcao: 0
>> Saindo...
```
