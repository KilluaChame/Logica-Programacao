# Exercícios de Variáveis

Bem-vindo ao conjunto de exercícios de **Variáveis** em Java!  
Este documento contém descrições e dicas para cada exercício. A ideia é você praticar os conceitos envolvidos, implementando os exemplos e, se necessário, buscar melhorias sem que sejam fornecidas as respostas completas.

---

## Exercício 1: Operações Aritméticas Básicas

**Descrição:**  
Crie um programa que declare duas variáveis inteiras, realize as quatro operações matemáticas (soma, subtração, multiplicação e divisão) entre elas e exiba os resultados no console.

**Dicas:**

- Utilize comentários seguindo o padrão utilizado nos exemplos (seções como **DECLARANDO**, **CALCULANDO** e **SAÍDA NO CONSOLE**).
- Trate o caso de divisão por zero, verificando se o divisor é zero antes de realizar a operação.

---

## Exercício 2: Comparação de Números

**Descrição:**  
Crie um programa que declare duas variáveis (pode ser `int` ou `double`) e, usando estruturas condicionais (`if-else`), determine e exiba qual número é maior, ou se eles são iguais.

**Dicas:**

- Separe a declaração das variáveis da lógica condicional com comentários para facilitar o entendimento.
- Exiba mensagens claras para cada caso de comparação (por exemplo, "número 1 é maior", "números iguais", "número 2 é maior").

---

## Exercício 3: Calculadora de Reajuste Salarial

**Descrição:**  
Desenvolva um programa que:

- Armazene um valor de salário em uma variável.
- Utilize uma estrutura condicional para aplicar um reajuste:
  - Se o salário for menor que um certo valor (por exemplo, 2000), aplique um aumento de 20%.
  - Caso contrário, aplique um aumento de 10%.
- Exiba o novo salário calculado no console.

**Dicas:**

- Divida o código em seções comentadas (por exemplo, **DECLARANDO**, **CALCULANDO** e **SAÍDA NO CONSOLE**).
- Use operações aritméticas para calcular o aumento percentual.
- Teste diferentes valores de salário para validar a lógica condicional.

---

/_ =========== Exercício 4: Média de Notas e Situação do Aluno =========== _/

        /*- Declare três variáveis do tipo `double` para armazenar as notas de um aluno.
          - Calcule a média das três notas.
          - Exiba uma mensagem informando se o aluno foi aprovado ou reprovado
          (por exemplo, aprovado se a média for 7.0 ou superior).

        Dicas:
            - Utilize o mesmo padrão de comentários (seções para DECLARANDO, CALCULANDO e SAÍDA NO CONSOLE).
            - Implemente uma estrutura condicional para verificar se a média atende ao critério de aprovação.
            - Teste com diferentes conjuntos de notas para garantir que o programa funciona corretamente em todos os cenários.*/

---

## Instruções Gerais

- **Organização dos Arquivos:**  
  Crie os arquivos Java de cada exercício dentro da pasta `src` da subpasta **Exercicios** do seu tópico de Variáveis. Por exemplo, use nomes como `Exercicio01_OperacoesAritmeticas.java`, `Exercicio02_ComparacaoDeNumeros.java` e assim por diante.

- **Compilação e Execução:**  
  Ao finalizar seu código, compile utilizando:

  ```bash
  javac *.java

  ```

  ***

## Exercício 5: Cálculo de Área e Perímetro de um Retângulo

**Descrição:**  
Crie um programa que:

- Declare duas variáveis do tipo `double` para armazenar a largura e a altura de um retângulo.
- Calcule e exiba a área e o perímetro do retângulo.

**Dicas:**

- A **área** de um retângulo é calculada como: largura × altura.
- O **perímetro** é calculado como: 2 × (largura + altura).
- Organize o código com seções como **DECLARANDO**, **CALCULANDO** e **SAÍDA NO CONSOLE**.
- Teste o programa com diferentes valores de largura e altura.

---

## Exercício 6: Conversão de Temperatura

**Descrição:**  
Desenvolva um programa que:

- Solicite ao usuário uma temperatura em graus Celsius (valor armazenado em uma variável `double`).
- Converta a temperatura para Fahrenheit usando a fórmula:  
  $$Fahrenheit = Celsius × 9/5 + 32$$
- Exiba a temperatura em Fahrenheit.

**Dicas:**

- Use a classe `Scanner` para receber a entrada do usuário.
- Certifique-se de explicar claramente ao usuário o que ele deve digitar.
- Divida o código em seções como **DECLARANDO**, **CALCULANDO** e **SAÍDA NO CONSOLE**.
