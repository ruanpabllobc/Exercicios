# Exercício 06 — Conceito por Faixa de Nota (if / else if / else)

## Enunciado

Escreva um programa em Java que leia uma nota (número decimal de 0 a 10) e
informe o **conceito** correspondente do aluno, utilizando uma cadeia de
decisões `if / else if / else`. Cada faixa de nota corresponde a um único
conceito, e apenas um deles deve ser exibido.

Faixas:

- Nota >= 9.0             -> Conceito A
- Nota >= 7.0 e < 9.0     -> Conceito B
- Nota >= 5.0 e < 7.0     -> Conceito C
- Nota >= 3.0 e < 5.0     -> Conceito D
- Nota < 3.0              -> Conceito E

## Pedido

> Utilizando `Scanner`, leia uma nota (`double`) chamada `nota`. Utilizando
> uma estrutura `if / else if / else`, exiba `"Conceito: X"`, onde `X` é a
> letra correspondente à faixa da nota.
>
> Observe que, numa cadeia `if / else if`, assim que uma condição é
> verdadeira as demais nem são testadas — por isso basta comparar o limite
> inferior de cada faixa.
>
> Trate também notas inválidas: se `nota` for menor que 0 ou maior que 10,
> exiba `"Nota invalida"` e não exiba conceito.

## Exemplo de execução

```
Nota: 7.5
Conceito: B
```
