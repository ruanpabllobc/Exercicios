# Exercício 07 — Aprovação por Média e Frequência (operador &&)

## Enunciado

Escreva um programa em Java que decida a situação de um aluno considerando
**dois critérios ao mesmo tempo**: a média das notas e a frequência nas
aulas. O aluno só é aprovado quando os dois critérios são satisfeitos, o que
torna natural o uso do operador lógico `&&` (E).

Regras:

- Aprovado: média >= 6.0 **E** frequência >= 75;
- Reprovado por Nota: frequência suficiente, mas média abaixo de 6.0;
- Reprovado por Falta: média suficiente, mas frequência abaixo de 75;
- Reprovado por Nota e Falta: os dois critérios abaixo do mínimo.

## Pedido

> Utilizando `Scanner`, leia `media` (`double`) e `frequencia` (`double`, em
> porcentagem). Usando `if / else if / else` e o operador `&&`, exiba uma
> das mensagens:
>
> - `"Situacao: Aprovado"`
> - `"Situacao: Reprovado por Nota"`
> - `"Situacao: Reprovado por Falta"`
> - `"Situacao: Reprovado por Nota e Falta"`
>
> Dica: guarde cada critério numa variável `boolean` (`notaOk`,
> `frequenciaOk`) e combine-as nas condições. O operador `!` inverte um
> `boolean`.

## Exemplo de execução

```
Media: 7
Frequencia: 60
Situacao: Reprovado por Falta
```
