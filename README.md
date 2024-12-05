# Employee Management Program

Este é um programa simples em Java desenvolvido para fins de estudo. Ele permite gerenciar uma lista de funcionários, realizar ajustes salariais e exibir informações sobre os empregados. O objetivo deste código é praticar conceitos básicos de Java, como:

- Estruturas de controle (`for`, `if`).
- Manipulação de listas (`ArrayList`).
- Filtragem e operações em listas usando `Stream API`.
- Manipulação de objetos personalizados.

## Descrição do Programa

O programa solicita ao usuário o registro de um número definido de funcionários, coletando as informações:

- **ID**.
- **Nome**.
- **Salário**.

O usuário pode selecionar um funcionário pelo ID para aplicar um aumento percentual ao salário.

As informações atualizadas são exibidas ao final do programa.

## Recursos Utilizados

### Classes Personalizadas:
- O programa utiliza a classe `Employee` para representar cada funcionário, encapsulando suas propriedades e métodos.

### Coleções (`ArrayList`):
- Armazena todos os objetos `Employee`.

### Stream API:
- Filtra a lista de funcionários para encontrar o funcionário pelo ID.

## Como Usar

1. Compile e execute o programa.
2. Digite o número de funcionários que serão registrados.
3. Para cada funcionário, insira:
   - **ID único**.
   - **Nome**.
   - **Salário**.
4. Informe o ID do funcionário que receberá o aumento salarial.
5. Insira o percentual de aumento (ex.: 10 para 10%).
6. O programa exibirá a lista atualizada de funcionários com os novos salários.
