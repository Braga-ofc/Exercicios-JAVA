# Lista #3 - Algoritmos e Programação (Java, somente DO-WHILE)

Exercícios 2, 4, 5, 6, 7, 8, 9, 10, 11 e 12.
Todos os laços de repetição usam **exclusivamente `do-while`** — nenhum `for` e nenhum `while` simples.

| Arquivo | Exercício |
|---|---|
| Ex2.java  | Todos os números pares entre 1 e 100 |
| Ex4.java  | 10 números: quantos pares, ímpares e primos |
| Ex5.java  | Maior número lido e quantas vezes ele foi lido |
| Ex6.java  | Soma dos pares e multiplicação dos ímpares do intervalo |
| Ex7.java  | Lê até digitar um negativo: maior e menor número |
| Ex8.java  | Idades até digitar ZERO: média, maior e menor |
| Ex9.java  | Menu de conversão km/h ↔ m/s |
| Ex10.java | Senha de quatro números (senha atual: 1 2 3 4) |
| Ex11.java | Soma dos 20 primeiros pares e dos 20 primeiros ímpares |
| Ex12.java | Três notas de 10 alunos: média de cada um e a maior média |

## Como compilar e executar

```bash
javac Ex2.java
java Ex2
```

Para compilar todos de uma vez:

```bash
javac *.java
```

## Observações

- A entrada de dados usa `Scanner` (equivalente ao `scanf` da versão em C).
- Ex4: o teste de primo conta os divisores de 1 até n com `do-while` e considera
  primo quando o número tem exatamente dois divisores.
- Ex12: os laços aninhados (10 alunos × 3 notas) também são `do-while`.
- Ex9 e Ex12: a leitura de decimais aceita ponto ou vírgula.
- Ex10: a senha está nas constantes `D1..D4`.
